package com.example.RestfulAPIAndPostgre.Logic.Service.Implement;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import com.example.RestfulAPIAndPostgre.Database.Repository.RoleRepository;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import com.example.RestfulAPIAndPostgre.Logic.Mapper.UserMapper;
import com.example.RestfulAPIAndPostgre.Logic.Service.Interface.UserService;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserMapper userMapper;

    @Override
    public User saveUser(User user) {
        if(user == null)
            return null;
        return userRepository.save(user);
    }

    @Override
    public User saveUserWithRole(User user, long roleId) {
        List<Role> roles = new ArrayList<>();
        Optional<Role> roleOptional = roleRepository.findById(roleId);
        if(roleOptional.isEmpty())
            return null;
        if(user == null)
            return null;
        roles.add(roleOptional.get());
        user.setRoles(roles);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent())
            return userOptional.get();
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        Optional<User> userOptional = userRepository.findByUserName(userName);
        if(userOptional.isPresent())
            return userOptional.get();
        return null;
    }

    @Override
    public List<User> getsForTable() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUserById(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()){
            userRepository.delete(userOptional.get());
            return true;
        }
        return false;
    }
}
