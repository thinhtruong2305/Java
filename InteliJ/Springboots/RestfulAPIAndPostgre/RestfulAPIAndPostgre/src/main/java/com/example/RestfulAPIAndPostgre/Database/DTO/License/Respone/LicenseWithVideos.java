package com.example.RestfulAPIAndPostgre.Database.DTO.License.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class LicenseWithVideos {
    private long licenseId;
    private String licenseName;
    private List<VideoNoRelationship> videos = new ArrayList<>();
}
