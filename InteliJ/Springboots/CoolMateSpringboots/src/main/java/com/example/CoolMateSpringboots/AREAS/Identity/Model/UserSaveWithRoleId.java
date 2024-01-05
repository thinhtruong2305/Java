package com.example.CoolMateSpringboots.AREAS.Identity.Model;

import com.example.CoolMateSpringboots.CONFIG.Validation.Annotation.ValidPassword;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class UserSaveWithRoleId {
    private long roleId;
    @Size(max = 50, message = "Tên tài khoản chỉ có khoảng 50 kí tự")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+", message = "Tên chứa kí tự cấm!")
    @NotBlank(message = "Không được để trống phần tên tài khoản")
    private String userName;
    @Size(min = 3, max = 20, message = "Tên chỉ có khoảng từ 3 đến 20 kí tự")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+", message = "Tên chứa kí tự cấm!")
    @NotBlank(message = "Không được để trống phần tên")
    private String firstName;
    @Size(min = 3, max = 30, message = "Họ chỉ có khoảng từ 3 đến 50 kí tự")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+", message = "Họ chứa kí tự cấm!")
    @NotBlank(message = "Không được để trống phần họ")
    private String lastName;
    @NotNull(message = "Không được để trống ngày sinh")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private String age;
    @NotBlank(message = "Không được để trống phần địa chỉ")
    private List<String> address;
    @Email(message = "Bạn nhập sai email")
    @NotBlank(message = "Không được để trống phần email")
    private String email;
    @Size(max = 32, message = "Mật khẩu chỉ có khoảng 32 kí tự")
    @ValidPassword(message = "Mật khẩu bạn đặt không úng theo quy cách")
    @NotBlank(message = "Không được để trống phần mật khẩu")
    private String password;
    @Size(max = 12, message = "Số điện thoại chỉ có khoảng 12 kí tự")
    @Pattern(regexp = "^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$",
            message = "Bạn nhập không đúng số điện thoại")
    @NotBlank(message = "Không được để trống số điện thoại")
    private List<String> phoneNumber;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;
    private String createBy;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date updateAt;
    private String updateBy;
}
