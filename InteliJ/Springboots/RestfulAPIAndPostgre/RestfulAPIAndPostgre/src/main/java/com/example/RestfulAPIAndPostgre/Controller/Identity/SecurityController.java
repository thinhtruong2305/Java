package com.example.RestfulAPIAndPostgre.Controller.Identity;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.MyUserDetails;
import com.example.RestfulAPIAndPostgre.Common.Model.Response.BaseResponse;
import com.example.RestfulAPIAndPostgre.Common.Model.Response.ErrorResponse;
import com.example.RestfulAPIAndPostgre.Common.Model.Response.LoginResponse;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.Jwt.JwtTokenUtil;
import com.example.RestfulAPIAndPostgre.Common.Util.Response;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserLogin;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSave;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.UserMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/security")
public class SecurityController {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil tokenProvider;
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @PostMapping("/account/login")
    public ResponseEntity<?> login(@Validated @RequestBody UserLogin userLogin, BindingResult result) {
        try{
            if(Global.validate(result) != null)
                return Global.validate(result);
            // Xác thực từ username và password.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userLogin.getUserNameOrEmail(),
                            userLogin.getPassword()
                    )
            );
            // Nếu không xảy ra exception tức là thông tin hợp lệ
            // Set thông tin authentication vào Security Context
            SecurityContextHolder.getContext().setAuthentication(authentication);
            // Trả về jwt cho người dùng.
            String jwt = tokenProvider.generateToken((MyUserDetails) authentication.getPrincipal());
            return Response.generateLoginResponse(new LoginResponse<Object>("Đăng nhập thành công", jwt), HttpStatus.OK);
        }catch (Exception e){
            return Response.generateErrorResponse(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST));
        }
    }
    @PostMapping("/account/register")
    public ResponseEntity register(@Validated @RequestBody UserSave userSave, BindingResult result) {
        try{
            if(Global.validate(result) != null)
                return Global.validate(result);
            if(userService.getUserByUserName(userSave.getUserName()) != null){
                return Response.generateErrorResponse(new ErrorResponse<Map<String,String>>("User name này đã được sử dụng", HttpStatus.BAD_REQUEST));
            }
            userSave.setPassword(passwordEncoder.encode(userSave.getPassword()));
            User user = userService.saveUserWithRole(userMapper.mapUserSaveToEntity(userSave), userSave.getRoleId());
            return Response.generateResponse(new BaseResponse("Đăng kí user thành công", user), HttpStatus.OK);
        }catch (Exception e){
            return Response.generateErrorResponse(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST));
        }
    }
}
