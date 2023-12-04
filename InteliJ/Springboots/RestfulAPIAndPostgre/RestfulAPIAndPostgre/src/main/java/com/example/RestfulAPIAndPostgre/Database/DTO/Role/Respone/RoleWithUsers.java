package com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone;

import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RoleWithUsers {
    private long roleId;
    private String roleName;
    private List<UserNoRelationship> usersNoRelationship = new ArrayList<>();
}
