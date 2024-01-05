package com.example.CoolMateSpringboots.UTILS.Response.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private String message;
    private String timeStamp;
    private T data;

    public BaseResponse(String message) {
        this.timeStamp = LocalDateTime.now().toString();
        this.message = message;
    }

    public BaseResponse(String message, T data) {
        this(message);
        this.data = data;
    }
}
