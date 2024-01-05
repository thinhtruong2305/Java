package com.example.CoolMateSpringboots.AREAS.Identity.Model;

import com.example.CoolMateSpringboots.CONFIG.Validation.Annotation.ValidPassword;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserLogin {
    @Pattern(regexp = "^(?:\\w+|\\w+([+\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.[a-zA-z]{2,4})+)$", message = "Tên không phải username hay email")
    @NotBlank(message = "Không được để trống phần tên tài khoản")
    private String userNameOrEmail;
    @ValidPassword(message = "Mật khẩu bạn nhập sai yêu cầu")
    @NotBlank(message = "Không được để trống phần mật khẩu")
    private String password;
    private boolean rememberMe;
}
