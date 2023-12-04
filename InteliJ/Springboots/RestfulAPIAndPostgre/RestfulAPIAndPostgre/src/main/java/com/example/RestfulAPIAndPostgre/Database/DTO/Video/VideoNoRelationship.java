package com.example.RestfulAPIAndPostgre.Database.DTO.Video;

import lombok.Data;

@Data
public class VideoNoRelationship {
    private long videoId;
    private String videoPath;
    private String imagePath;
    private String videoName;
    private int episode;
    private int views;
}
