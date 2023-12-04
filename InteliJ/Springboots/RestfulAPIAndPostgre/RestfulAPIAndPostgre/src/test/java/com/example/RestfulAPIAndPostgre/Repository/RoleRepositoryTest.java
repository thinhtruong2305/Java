package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Repository.RoleRepository;
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

import java.time.LocalDateTime;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryTest {
    @Autowired
    RoleRepository roleRepository;
    private static final String ROLE_NAME = "ROLE_ADMIN";
    //private static final LocalDateTime CREATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String CREATE_BY = "admin1";

    @Test
    @Rollback(value = false)
    public void stage_1_saveRole(){
        Role role = new Role();
        role.setRoleName(ROLE_NAME);
        //role.setCreateAt(CREATE_AT);
        role.setCreateBy(CREATE_BY);
        Role roleSave = roleRepository.save(role);
        Assertions.assertNotNull(roleSave);
    }

    @Test
    @Rollback(value = false)
    public void stage_2_findByRoleName(){
        Optional<Role> role = roleRepository.findByRoleName(com.example.RestfulAPIAndPostgre.Common.Model.Entity.Enum.Role.ROLE_USER.toString());
        Assertions.assertNotNull(role);
    }
}
