package com.example.RestfulAPIAndPostgre.Database.DTO.Tag;

import lombok.Data;

@Data
public class TagNoRelationship {
    private long tagId;
    private long parentId;
    private String tagName;
}
