package com.example.CoolMateSpringboots.UTILS;

import com.example.CoolMateSpringboots.UTILS.Response.Model.ErrorResponse;
import com.example.CoolMateSpringboots.UTILS.Response.MyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

public class Global {
    @Autowired
    private static JWTToken tokenProvider;
    @Autowired
    //private static UserServiceImpl userService;

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
            return MyResponse.generateErrorResponse(new ErrorResponse("Bạn đã gặp lỗi nhập không đúng quy cách",
                    HttpStatus.BAD_REQUEST, errorMap));
        }
        return null;
    }
}
