package com.example.RestfulAPIAndPostgre.Logic.Service.Interface;

import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    User saveUserWithRole(User user, long roleId);
    User getUserById(long id);
    User getUserByUserName(String userName);
    List<User> getsForTable();
    boolean deleteUserById(long id);
}
