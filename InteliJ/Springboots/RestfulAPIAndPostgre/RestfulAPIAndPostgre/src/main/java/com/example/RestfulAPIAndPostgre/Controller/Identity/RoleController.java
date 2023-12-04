package com.example.RestfulAPIAndPostgre.Controller.Identity;

import com.example.RestfulAPIAndPostgre.Database.DTO.Role.Request.RoleSave;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.RoleMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/role")
public class RoleController {
    public ResponseEntity<Role> getsRole(RoleSave roleSave){
        return null;
    }
    public ResponseEntity<Role> saveRole(RoleSave roleSave){
        return null;
    }
    public ResponseEntity<Role> getRoleDetail(long roleId){
        return null;
    }
    public ResponseEntity<Role> deleteRole(long roleId){
        return null;
    }
}
