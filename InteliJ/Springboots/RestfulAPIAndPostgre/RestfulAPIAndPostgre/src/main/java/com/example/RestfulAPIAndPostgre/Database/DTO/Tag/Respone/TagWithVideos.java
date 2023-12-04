package com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.Video.VideoNoRelationship;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class TagWithVideos {
    private long tagId;
    private long parentId;
    private String tagName;
    private Set<VideoNoRelationship> videosNoRelationship = new HashSet<>();
}
