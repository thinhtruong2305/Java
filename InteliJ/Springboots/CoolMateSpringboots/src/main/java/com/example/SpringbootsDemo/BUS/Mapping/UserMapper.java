package com.example.CoolMateSpringboots.BUS.Mapping;

import com.example.CoolMateSpringboots.AREAS.Identity.Model.UserSave;
import com.example.CoolMateSpringboots.AREAS.Identity.Model.UserSaveWithRoleId;
import com.example.CoolMateSpringboots.DAL.Entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DateMapper.class})
public interface UserMapper {
    @Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy")
    @Mapping(source = "updateAt", target = "updateAt", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "employee", ignore = true)
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "rates", ignore = true)
    User mapUserSaveToUser(UserSave userSave);
    @Mapping(source = "age", target = "age", dateFormat = "dd/MM/yyyy")
    @Mapping(source = "createAt", target = "createAt", dateFormat = "dd/MM/yyyy")
    @Mapping(source = "updateAt", target = "updateAt", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "employee", ignore = true)
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "rates", ignore = true)
    User mapUserSaveWithRoleIdToUser(UserSaveWithRoleId userSaveWithRoleId);
}
