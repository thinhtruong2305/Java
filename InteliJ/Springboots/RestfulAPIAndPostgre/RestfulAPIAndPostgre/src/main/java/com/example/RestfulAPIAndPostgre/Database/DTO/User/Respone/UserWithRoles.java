package com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.Role.RoleNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserWithRoles {
    private long userId;
    private String userName;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    private List<RoleNoRelationship> roles = new ArrayList<>();
}
