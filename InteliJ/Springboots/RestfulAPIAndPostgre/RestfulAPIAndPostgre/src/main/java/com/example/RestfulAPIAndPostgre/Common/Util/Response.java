package com.example.RestfulAPIAndPostgre.Common.Util;

import com.example.RestfulAPIAndPostgre.Common.Model.Response.BaseResponse;
import com.example.RestfulAPIAndPostgre.Common.Model.Response.ErrorResponse;
import com.example.RestfulAPIAndPostgre.Common.Model.Response.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class Response {
    public static ResponseEntity generateLoginResponse(LoginResponse response, HttpStatus status) {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("Time stamp", response.getTimeStamp());
        map.put("Message", response.getMessage());
        map.put("Token", response.getData());
        return new ResponseEntity(map, status);
    }
    public static ResponseEntity generateErrorResponse(ErrorResponse response) {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("Time stamp", response.getTimeStamp());
        map.put("Message", response.getMessage());
        map.put("Errors", response.getData());
        map.put("Stack trace", response.getStackTrace());
        return new ResponseEntity(map, HttpStatus.valueOf(response.getStatus()));
    }
    public static ResponseEntity generateResponse(BaseResponse response, HttpStatus status) {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("Time stamp", response.getTimeStamp());
        map.put("Message", response.getMessage());
        map.put("Data", response.getData());
        return new ResponseEntity(map, status);
    }
}
