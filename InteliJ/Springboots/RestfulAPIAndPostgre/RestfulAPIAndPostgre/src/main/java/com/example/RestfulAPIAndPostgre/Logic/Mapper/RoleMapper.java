package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Request.RoleSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone.RoleWithIdNameStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Respone.RoleWithUsers;
import com.example.RestfulAPIAndPostgre.Database.DTO.Role.RoleNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RoleMapper {
//    @Mapping(target = "users", ignore = true)
//    @Mapping(target = "createAt", ignore = true)
//    @Mapping(target = "createBy", ignore = true)
//    @Mapping(target = "updateAt", ignore = true)
//    @Mapping(target = "updateBy", ignore = true)
//    @Mapping(target = "status", ignore = true)
//    Role mapRoleSaveToRole(RoleSave roleSave);
//    RoleWithIdNameStatus mapRoleToSummaryForTable(Role role);
//    @Mapping(source = "users", target = "usersNoRelationship")
//    RoleWithUsers mapRoleToRoleWithUser(Role role);
//    RoleNoRelationship mapRoleToRoleNoRelationship(Role role);
}
