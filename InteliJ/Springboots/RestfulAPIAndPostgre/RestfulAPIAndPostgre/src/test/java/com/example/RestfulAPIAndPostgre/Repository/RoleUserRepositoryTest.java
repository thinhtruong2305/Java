package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Repository.RoleRepository;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleUserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    private static final long USER_ID = 1;
    private static final long ROLE_ID = 2;

    @Test
    @Rollback(value = false)
    public void stage_1_findAndSaveUserAndRoleById(){
        Optional<User> userOptional = userRepository.findById(USER_ID);
        Optional<Role> roleOptional = roleRepository.findById(ROLE_ID);
        if(userOptional.isEmpty())
            return;
        if(roleOptional.isEmpty())
            return;
        List<Role> roles = new ArrayList<>();
        roles.add(roleOptional.get());
        userOptional.get().setRoles(roles);
        userRepository.save(userOptional.get());
        Assertions.assertNotNull(userOptional.get());
    }
}
