package com.example.RestfulAPIAndPostgre.Logic.Mapper;

import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSave;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSaveWithRoles;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Request.UserSaveWithVideos;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.UserNoRelationship;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone.UserWithIdUserNameEmailStatus;
import com.example.RestfulAPIAndPostgre.Database.DTO.User.Respone.UserWithVideos;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//@Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy hh:mm")
//@Mapping(source = "updateAt",target = "updateAt", dateFormat = "dd/MM/yyyy hh:mm")
@Mapper(componentModel = "spring", uses = {VideoMapper.class, LicenseMapper.class})
public interface UserMapper {
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "videos", ignore = true)
    @Mapping(target = "license", ignore = true)
    User mapUserSaveWithRolesToEntity(UserSaveWithRoles userSaveWithRoles);
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "license", ignore = true)
    User mapUserSaveWithVideosToEntity(UserSaveWithVideos userSaveWithVideos);
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "videos", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "license", ignore = true)
    @Mapping(target = "createAt", ignore = true)
    @Mapping(target = "createBy", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "updateBy", ignore = true)
    @Mapping(target = "status", ignore = true)
    User mapUserSaveToEntity(UserSave userSave);
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    @Mapping(source = "videos", target = "videos")
    UserWithVideos mapUserToUserWithVideos(User user);
    UserWithIdUserNameEmailStatus mapUserToSummaryForTable(User user);
    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
    UserNoRelationship mapUserToUserNoRelationship(User user);
}
