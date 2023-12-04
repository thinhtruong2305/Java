package com.example.RestfulAPIAndPostgre.Logic.Service.Implement;

import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Repository.RoleRepository;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    /**
     * @param role
     * @return
     */
    @Override
    public Role saveRole(Role role) {
        if(role != null)
            return roleRepository.save(role);
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Role getRoleById(long id) {
        Optional<Role> roleOptional = roleRepository.findById(id);
        if(roleOptional.isPresent())
            return roleOptional.get();
        return null;
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Role getRoleByName(String name) {
        Optional<Role> roleOptional = roleRepository.findByRoleName(name);
        if(roleOptional.isPresent())
            return roleOptional.get();
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Role> getsRole() {
        return roleRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteRoleById(long id) {
        Optional<Role> roleOptional = roleRepository.findById(id);
        if(roleOptional.isPresent()){
            roleRepository.delete(roleOptional.get());
            return true;
        }
        return false;
    }
}
