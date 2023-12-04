package com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Status;
import lombok.Data;

@Data
public class RoleWithIdNameStatus {
    private long roleId;
    private String roleName;
    private Status status;
}
