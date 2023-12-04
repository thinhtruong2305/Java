package com.example.RestfulAPIAndPostgre.Common.Util;

import com.example.RestfulAPIAndPostgre.Common.Model.Response.ErrorResponse;
import com.example.RestfulAPIAndPostgre.Common.Util.Jwt.JwtTokenUtil;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSave;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

public class Global {
    @Autowired
    private static JwtTokenUtil tokenProvider;
    @Autowired
    private static UserService userService;

    public static long getUserId(String jwt) {
        Long userId = tokenProvider.getUserIdFromJWT(jwt);
        return userId;
    }

    public static ResponseEntity validate(BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            result.getFieldErrors().forEach(error -> {
                errorMap.put(error.getField(), error.getDefaultMessage());
            });
            return Response.generateErrorResponse(new ErrorResponse<Map<String, String>>("Bạn đã gặp lỗi nhập không đúng quy cách",
                    HttpStatus.BAD_REQUEST, errorMap));
        }
        return null;
    }
}
