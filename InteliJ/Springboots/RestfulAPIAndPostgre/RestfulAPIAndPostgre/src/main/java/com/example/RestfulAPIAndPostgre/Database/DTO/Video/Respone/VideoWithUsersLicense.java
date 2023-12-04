package com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.License.LicenseNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class VideoWithUsersLicense {
    private long videoId;
    private String videoPath;
    private String imagePath;
    private String videoName;
    private int episode;
    private int views;
    private List<UserNoRelationship> users =  new ArrayList<>();
    private LicenseNoRelationship license;
}
