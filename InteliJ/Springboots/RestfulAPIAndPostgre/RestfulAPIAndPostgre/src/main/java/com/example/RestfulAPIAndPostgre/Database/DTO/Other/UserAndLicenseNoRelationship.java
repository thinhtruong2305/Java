package com.example.RestfulAPIAndPostgre.Database.DTO.Other;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UserAndLicenseNoRelationship {
    private long licenseId;
    private long userId;
    private String licenseName;
    private String userName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private String email;
    private String password;
}
