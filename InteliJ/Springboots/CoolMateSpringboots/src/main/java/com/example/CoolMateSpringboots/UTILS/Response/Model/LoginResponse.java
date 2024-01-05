package com.example.CoolMateSpringboots.UTILS.Response.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class LoginResponse<T> extends BaseResponse {
    public LoginResponse(String message, T token) {
        super(message,token);
    }
}
