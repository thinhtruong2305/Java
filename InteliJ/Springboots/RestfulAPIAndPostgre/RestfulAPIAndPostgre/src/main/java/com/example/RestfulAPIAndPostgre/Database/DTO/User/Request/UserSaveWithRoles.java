package com.example.RestfulAPIAndPostgre.Database.DTO.User.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import com.example.RestfulAPIAndPostgre.Common.Model.Valid.Annotation.ValidPassword;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UserSaveWithRoles {
    private long userId;
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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
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
    private String phoneNumber;
    private List<Role> roles = new ArrayList<>();
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private OffsetDateTime createAt;
    private String createBy;
    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
    private OffsetDateTime updateAt;
    private String updateBy;
    private Status status = Status.INACTIVE;
}
