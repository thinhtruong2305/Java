package com.example.RestfulAPIAndPostgre.Database.DTO.Tag.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;

@Data
public class TagWithIdParentIdNameStatus {
    private long tagId;
    private long parentId;
    private String tagName;
    private Status status;
}
