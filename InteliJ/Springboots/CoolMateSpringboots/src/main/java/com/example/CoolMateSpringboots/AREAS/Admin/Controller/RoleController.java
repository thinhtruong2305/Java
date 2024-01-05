package com.example.CoolMateSpringboots.AREAS.Admin.Controller;

import com.example.CoolMateSpringboots.DAL.Entities.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/Role")
public class RoleController {
    public ResponseEntity<?> saveRole(Role roleSave){
        return null;
    }
}
