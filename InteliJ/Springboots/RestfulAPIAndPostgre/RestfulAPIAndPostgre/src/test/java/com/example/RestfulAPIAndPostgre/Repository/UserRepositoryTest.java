package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private static User USER = new User();
    //Create
    private static final String USER_NAME_CREATE = "Nguyễn Văn B";
    private static final String FIRST_NAME_CREATE = "B";
    private static final String LAST_NAME_CREATE = "Nguyễn Văn";
    //private static final LocalDate BIRTH_DATE_CREATE = LocalDate.of(2006,8,18);
    private static final String EMAIL_CREATE = "Buser@gmail.com";
    private static final String PASSWORD_CREATE = "Bnguyen@123";
    private static final String PHONE_NUMBER_CREATE = "012241785";
    //private static final LocalDateTime CREATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String CREATE_BY = "admin1";
    //Update
    private static final String USER_NAME_UPDATE = "Nguyễn Văn W";
    //private static final LocalDateTime UPDATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime();
    private static final String UPDATE_BY = "admin2";

    @Test
    @Rollback(value = false)
    public void stage_1_saveUser(){
        User user = new User();
        user.setUserName(USER_NAME_CREATE);
        user.setFirstName(FIRST_NAME_CREATE);
        user.setLastName(LAST_NAME_CREATE);
        //user.setBirthDate(BIRTH_DATE_CREATE);
        user.setEmail(EMAIL_CREATE);
        user.setPassword(passwordEncoder.encode(PASSWORD_CREATE));
        user.setPhoneNumber(PHONE_NUMBER_CREATE);
        //user.setCreateAt(CREATE_AT);
        user.setCreateBy(CREATE_BY);
        User userSave = userRepository.save(user);
        USER = userSave;
        System.out.println(USER);
        Assertions.assertNotNull(userSave);
    }

    @Test
    @Rollback(value = false)
    public void stage_2_findUserById(){
        Optional<User> userOptional = userRepository.findById(USER.getUserId());
        if(userOptional.isPresent())
            System.out.println(userOptional.get());
        Assertions.assertNotNull(userOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_3_findUserByUserName(){
        Optional<User> userOptional = userRepository.findByUserName(USER.getUserName());
        if(userOptional.isPresent())
            System.out.println(userOptional.get());
        Assertions.assertNotNull(userOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_5_getAllUser(){
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            user.toString();
        });
        Assert.notEmpty(users);
    }

    @Test
    @Rollback(value = false)
    public void stage_6_updateUserById(){
        Optional<User> userOptional = userRepository.findById(USER.getUserId());
        if(userOptional.isPresent()){
            userOptional.get().setUserName(USER_NAME_UPDATE);
            //userOptional.get().setUpdateAt(UPDATE_AT);
            userOptional.get().setUpdateBy(UPDATE_BY);
            userRepository.save(userOptional.get());
        }
        Optional<User> userUpdate = userRepository.findByUserName(USER_NAME_UPDATE);
        if(userUpdate.isPresent())
            System.out.println(userUpdate.get());
        Assertions.assertEquals(userUpdate.get().getUserName(), USER_NAME_UPDATE);
    }

    @Test
    @Rollback(value = false)
    public void stage_7_deleteUserById_WithoutLicense(){
        boolean isExistBeforeDelete = userRepository.findById(USER.getUserId()).isPresent();
        userRepository.deleteById(USER.getUserId());
        boolean notExistAfterDelete = userRepository.findById(USER.getUserId()).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
