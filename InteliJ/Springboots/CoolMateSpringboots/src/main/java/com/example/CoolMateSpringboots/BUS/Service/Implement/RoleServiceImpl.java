package com.example.CoolMateSpringboots.BUS.Service.Implement;

import com.example.CoolMateSpringboots.BUS.Service.Interface.IRoleService;
import com.example.CoolMateSpringboots.DAL.Entities.Role;
import com.example.CoolMateSpringboots.DAL.Repository.IRoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
    private Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);
    @Override
    public Streamable<Role> getAll() {
        try{
            return Streamable.of(roleRepository.findAll());
        }catch (Exception e){
            log.error("Error from (getAll in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<Streamable<Role>> getAllAsync() {
        try{
            return CompletableFuture.completedFuture(Streamable.of(roleRepository.findAll()));
        }catch (Exception e){
            log.error("Error from (getAllAsync in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public Role getById(Long id) {
        try{
            Optional<Role> optional = roleRepository.findById(id);
            if(optional.isPresent())
                return optional.get();
        }catch (Exception e){
            log.error("Error from (getById in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<Role> getByIdAsync(Long id) {
        try{
            Optional<Role> optional = roleRepository.findById(id);
            if(optional.isPresent())
                return CompletableFuture.completedFuture(optional.get());
        }catch(Exception e){
            log.error("Error from (getByIdAsync in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
        return null;
    }

    @Override
    public Role saveEntity(Role role) {
        try{
            return roleRepository.save(role);
        }catch (Exception e){
            log.error("Error from (saveEntity in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return null;
    }

    @Async
    @Override
    public CompletableFuture<Role> saveEntityAsync(Role role) {
        try{
            return CompletableFuture.completedFuture(roleRepository.save(role));
        }catch (Exception e){
            log.error("Error from (saveEntityAsync in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public boolean removeById(Long id) {
        try{
            roleRepository.deleteById(id);
            return true;
        } catch (Exception e){
            log.error("Error from (removeById in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return false;
    }

    @Async
    @Override
    public CompletableFuture<Boolean> removeByIdAsync(Long id) {
        try{
            roleRepository.deleteById(id);
            return CompletableFuture.completedFuture(true);
        } catch (Exception e){
            log.error("Error from (removeByIdAsync in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public boolean removeByEntity(Role role) {
        try{
            roleRepository.delete(role);
            return true;
        } catch (Exception e){
            log.error("Error from (removeByEntity in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
        }
        return false;
    }

    @Override
    public CompletableFuture<Boolean> removeByEntityAsync(Role role) {
        try{
            roleRepository.delete(role);
            return CompletableFuture.completedFuture(true);
        } catch (Exception e){
            log.error("Error from (removeByIdAsync in BaseServiceImpl) \"" + e.getMessage() + "\"", e);
            return CompletableFuture.failedFuture(e);
        }
    }

    @Override
    public Role getByName(String name) {
        return null;
    }

    @Override
    public CompletableFuture<Role> getByNameAsync(String name) {
        return null;
    }
}
