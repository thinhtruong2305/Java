package com.example.CoolMateSpringboots.AREAS.Identity.Controller;

import com.example.CoolMateSpringboots.AREAS.Identity.Model.UserLogin;
import com.example.CoolMateSpringboots.AREAS.Identity.Model.UserSaveWithRoleId;
import com.example.CoolMateSpringboots.BUS.Mapping.UserMapper;
import com.example.CoolMateSpringboots.BUS.Service.Interface.IUserService;
import com.example.CoolMateSpringboots.DAL.Entities.User;
import com.example.CoolMateSpringboots.DAL.OtherObject.MyUserDetails;
import com.example.CoolMateSpringboots.UTILS.DateConvert;
import com.example.CoolMateSpringboots.UTILS.Global;
import com.example.CoolMateSpringboots.UTILS.JWTToken;
import com.example.CoolMateSpringboots.UTILS.Response.Model.BaseResponse;
import com.example.CoolMateSpringboots.UTILS.Response.Model.ErrorResponse;
import com.example.CoolMateSpringboots.UTILS.Response.Model.LoginResponse;
import com.example.CoolMateSpringboots.UTILS.Response.MyResponse;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/security")
public class SecurityController {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JWTToken tokenProvider;
    @Autowired
    UserMapper userMapper;
    @Autowired
    private IUserService userService;

    @PostMapping("/account/login")
    public ResponseEntity<?> login(@RequestBody UserLogin userLogin, BindingResult result) {
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
            return MyResponse.generateLoginResponse(new LoginResponse("Đăng nhập thành công", jwt), HttpStatus.OK);
        }catch (Exception e){
            return MyResponse.generateErrorResponse(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST));
        }
    }
    @PostMapping("/account/register")
    public ResponseEntity register(@RequestBody UserSaveWithRoleId userSave, BindingResult result) {
        try{
            if(Global.validate(result) != null)
                return Global.validate(result);
            if(userService.getByUserName(userSave.getUserName()) != null){
                return MyResponse.generateErrorResponse(new ErrorResponse<Map<String,String>>("User name này đã được sử dụng", HttpStatus.BAD_REQUEST));
            }
            userSave.setPassword(passwordEncoder.encode(userSave.getPassword()));
            userSave.setCreateAt(DateConvert.convertLocalDateTimeToDate(LocalDateTime.now()));
            userSave.setCreateBy("admin1");
            User user = userService.saveWithRoleId(userMapper.mapUserSaveWithRoleIdToUser(userSave), userSave.getRoleId());
            return MyResponse.generateResponse(new BaseResponse("Đăng kí user thành công", user), HttpStatus.OK);
        }catch (Exception e){
            return MyResponse.generateErrorResponse(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST));
        }
    }
}
