package com.example.CoolMateSpringboots.BUS.Service.Implement;

import com.example.CoolMateSpringboots.DAL.Entities.User;
import com.example.CoolMateSpringboots.DAL.OtherObject.MyUserDetails;
import com.example.CoolMateSpringboots.DAL.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {
        // Kiểm tra xem user có tồn tại trong database không?
        Optional<User> userOptional = userRepository.findByUserNameOrEmail(userNameOrEmail, userNameOrEmail);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException(userNameOrEmail);
        }
        return new MyUserDetails(userOptional.get());
    }
}
