package com.example.CoolMateSpringboots.BUS.Service.Interface;

import com.example.CoolMateSpringboots.DAL.Entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.concurrent.CompletableFuture;

public interface IUserService extends IBaseService<User, Long> {
    public User getByUserNameOrEmail(String userName, String email);
    public CompletableFuture<User> getByUserNameOrEmailAsync(String userName, String email);
    public User getByUserName(String userName);
    public CompletableFuture<User> getByUserNameAsync(String userName);
    public User getByFirstName(String firstName);
    public CompletableFuture<User> getByFirstNameAsync(String firstName);
    public User getByLastName(String lastName);
    public CompletableFuture<User> getByLastNameAsync(String lastName);
    public User getByUserNameAndPassword(String userName, String password);
    public CompletableFuture<User> getByUserNameAndPassworAsync(String userName, String password);
    public User saveWithRoleId(User user, long id);
    public CompletableFuture<User> saveWithRoleIdAsync(User user, long id);
    public UserDetails loadUserById(long id);
}
