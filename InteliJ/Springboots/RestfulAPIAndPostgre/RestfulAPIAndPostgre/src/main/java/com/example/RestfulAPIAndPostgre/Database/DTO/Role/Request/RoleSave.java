package com.example.RestfulAPIAndPostgre.Database.DTO.Role.Request;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Data
public class RoleSave {
    private long roleId;
    @NotBlank(message = "Không được để trống phần tên vai trò")
    @Length(max = 50, message = "Tên vai trò chỉ có khoảng 50 kí tự")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+", message = "Tên chứa kí tự cấm!")
    private String roleName;
}
