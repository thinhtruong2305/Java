package com.example.RestfulAPIAndPostgre.Database.DTO.User.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Valid.Annotation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.*;


@Data
public class UserLogin {
    @Pattern(regexp = "^(?:\\w+|\\w+([+\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.[a-zA-z]{2,4})+)$", message = "Tên không phải username hay email")
    @NotBlank(message = "Không được để trống phần tên tài khoản")
    private String userNameOrEmail;
    @ValidPassword(message = "Mật khẩu không đúng")
    @NotBlank(message = "Không được để trống phần mật khẩu")
    private String password;
    private boolean rememberMe;
}
