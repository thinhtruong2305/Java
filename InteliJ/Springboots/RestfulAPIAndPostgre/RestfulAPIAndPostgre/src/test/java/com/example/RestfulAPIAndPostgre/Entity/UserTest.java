package com.example.RestfulAPIAndPostgre.Entity;

import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;

import static org.junit.Assert.assertThat;

import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {
    @Autowired
    UserRepository userRepository;

    /*@Test
    @Rollback(value = false)
    public void saveUser_shouldSaveWithBuilderDefaultValueAndNullable(){
        User user = User.builder()
                .userName("Trương Văn Tiến Thịnh")
                .birthDate(LocalDate.of(2001,5,23))
                .email("thinhuser@gmail.com")
                .password("Thinh@123")
                .createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        User userSave = userRepository.save(user);
    }

    @Test
    @Rollback(value = false)
    public void saveUser_shouldSaveWithSetDefaultValueAndNullable(){
        User user = new User();
        user.setUserName("Phan Nhựt Trường");
        user.setBirthDate(LocalDate.of(2006,8,18));
        user.setEmail("truonguser@gmail.com");
        user.setPassword("Truong@123");
        user.setCreateAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime());
        user.setCreateBy("Admin2");
        User userSave = userRepository.save(user);
        Assertions.assertNotNull(userSave);
    }

    @Test
    @Rollback(value = false)
    public void saveUser_shouldSaveWithConstructorDefaultValueAndNullable(){
        User userSave = userRepository.save(new User(
                DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime(),
                "Admin3",
                null, null, null, null, null, null, 0,
                "Nguyễn Thị Quỳnh Giang",
                LocalDate.of(2005,7,12), null,
                "gianguser@gmail.com",
                "Giang@123",null,null));
        Assertions.assertNotNull(userSave);
    }
    @Test
    @Rollback(value = false)
    public void findUser_shouldFindById(){
        Optional<User> users = userRepository.findById(Long.valueOf(4));
        if(users != null){
            Assertions.assertEquals(users.get().getUserId(), 4);
            System.out.println(users.get().getUserName());
        }
    }*/
}
