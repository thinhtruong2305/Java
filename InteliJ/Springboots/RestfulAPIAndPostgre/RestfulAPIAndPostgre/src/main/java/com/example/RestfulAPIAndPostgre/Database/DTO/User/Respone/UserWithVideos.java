package com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class UserWithVideos {
    private long userId;
    private String userName;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    private List<VideoNoRelationship> videos = new ArrayList<>();
}
