package com.example.RestfulAPIAndPostgre.Database.DTO.User;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UserNoRelationship {
    private long userId;
    private String userName;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
}
