package com.example.RestfulAPIAndPostgre.Logic.Service.Interface;

import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    Role getRoleById(long id);
    Role getRoleByName(String name);
    List<Role> getsRole();
    boolean deleteRoleById(long id);
}
