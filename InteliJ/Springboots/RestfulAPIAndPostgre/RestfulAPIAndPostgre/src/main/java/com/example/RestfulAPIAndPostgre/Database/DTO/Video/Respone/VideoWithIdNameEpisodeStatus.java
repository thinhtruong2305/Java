package com.example.RestfulAPIAndPostgre.Database.DTO.Video.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;

@Data
public class VideoWithIdNameEpisodeStatus {
    private long videoId;
    private String videoName;
    private int episode;
    private Status status;
}
