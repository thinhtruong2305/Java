package com.example.CoolMateSpringboots.BUS.Service.Implement;

import com.example.CoolMateSpringboots.BUS.Service.Interface.IRoleService;
import com.example.CoolMateSpringboots.BUS.Service.Interface.IUserService;
import com.example.CoolMateSpringboots.DAL.Entities.Role;
import com.example.CoolMateSpringboots.DAL.Entities.User;
import com.example.CoolMateSpringboots.DAL.OtherObject.MyUserDetails;
import com.example.CoolMateSpringboots.DAL.Repository.IUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;
    @Autowired
    IRoleService roleService;
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getByUserNameOrEmail(String userName, String email) {
        try{
            Optional<User> optional = userRepository.findByUserNameOrEmail(userName, email);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getByUserNameOrEmail in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<User> getByUserNameOrEmailAsync(String userName, String email) {
        try{
            Optional<User> optional = userRepository.findByUserNameOrEmail(userName, email);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByUserNameOrEmailAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User getByUserName(String userName) {
        try{
            Optional<User> optional = userRepository.findByUserName(userName);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getByUserName in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }
    @Async
    @Override
    public CompletableFuture<User> getByUserNameAsync(String userName) {
        try{
            Optional<User> optional = userRepository.findByUserName(userName);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByUserNameAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User getByFirstName(String firstName) {
        try{
            Optional<User> optional = userRepository.findByFirstName(firstName);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getByFirstName in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }
    @Async
    @Override
    public CompletableFuture<User> getByFirstNameAsync(String firstName) {
        try{
            Optional<User> optional = userRepository.findByFirstName(firstName);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByFirstNameAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User getByLastName(String lastName) {
        try{
            Optional<User> optional = userRepository.findByLastName(lastName);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getByLastName in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<User> getByLastNameAsync(String lastName) {
        try{
            Optional<User> optional = userRepository.findByLastName(lastName);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByLastNameAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User getByUserNameAndPassword(String userName, String password) {
        try{
            Optional<User> optional = userRepository.findByUserNameAndPassword(userName, password);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getByUserNameAndPassword in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<User> getByUserNameAndPassworAsync(String userName, String password) {
        try{
            Optional<User> optional = userRepository.findByUserNameAndPassword(userName, password);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByLastNameAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User saveWithRoleId(User user, long id) {
        try{
            Role role = roleService.getById(id);
            if(role == null){
                log.error("Error from (saveWithRoleId in UserServiceImpl) role == null");
                return null;
            }
            return userRepository.save(user);
        }catch (Exception e){
            log.error("Error from (saveWithRoleId in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Override
    public CompletableFuture<User> saveWithRoleIdAsync(User user, long id) {
        try{
            return CompletableFuture.completedFuture(userRepository.save(user));
        }catch (Exception e){
            log.error("Error from (saveEntityAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public UserDetails loadUserById(long id) {
        // Kiểm tra xem user có tồn tại trong database không?
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent())
            return new MyUserDetails(userOptional.get());
        return null;
    }

    @Override
    public Streamable<User> getAll() {
        try{
            return Streamable.of(userRepository.findAll());
        }catch (Exception e){
            log.error("Error from (getAll in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<Streamable<User>> getAllAsync() {
        try{
            return CompletableFuture.completedFuture(Streamable.of(userRepository.findAll()));
        }catch (Exception e){
            log.error("Error from (getAllAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public User getById(Long id) {
        try{
            Optional<User> optional = userRepository.findById(id);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getById in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<User> getByIdAsync(Long id) {
        try{
            Optional<User> optional = userRepository.findById(id);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByIdAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public User saveEntity(User user) {
        try{
            return userRepository.save(user);
        }catch (Exception e){
            log.error("Error from (saveEntity in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<User> saveEntityAsync(User user) {
        try{
            return CompletableFuture.completedFuture(userRepository.save(user));
        }catch (Exception e){
            log.error("Error from (saveEntityAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public boolean removeById(Long id) {
        try{
            userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            log.error("Error from (removeById in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return false;
    }

    @Async
    @Override
    public CompletableFuture<Boolean> removeByIdAsync(Long id) {
        try{
            userRepository.deleteById(id);
            return CompletableFuture.completedFuture(true);
        } catch (Exception e){
            log.error("Error from (removeByIdAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public boolean removeByEntity(User user) {
        try{
            userRepository.delete(user);
            return true;
        } catch (Exception e){
            log.error("Error from (removeByEntity in UserServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return false;
    }

    @Override
    public CompletableFuture<Boolean> removeByEntityAsync(User user) {
        try{
            userRepository.delete(user);
            return CompletableFuture.completedFuture(true);
        } catch (Exception e){
            log.error("Error from (removeByIdAsync in UserServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }
}
