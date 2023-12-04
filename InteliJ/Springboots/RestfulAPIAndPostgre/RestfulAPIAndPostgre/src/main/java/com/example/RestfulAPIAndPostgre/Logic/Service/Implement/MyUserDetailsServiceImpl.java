package com.example.RestfulAPIAndPostgre.Logic.Service.Implement;

import com.example.RestfulAPIAndPostgre.Common.Model.Entity.MyUserDetails;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userNameOrEmail){
        // Kiểm tra xem user có tồn tại trong database không?
        Optional<User> userOptional = userRepository.findByUserNameOrEmail(userNameOrEmail, userNameOrEmail);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException(userNameOrEmail);
        }
        return new MyUserDetails(userOptional.get());
    }

    public UserDetails loadUserByUserId(long userId){
        // Kiểm tra xem user có tồn tại trong database không?
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            return new MyUserDetails(userOptional.get());
        }
        return null;
    }
}
