package com.example.CoolMateSpringboots.BUS.Service.Interface;

import com.example.CoolMateSpringboots.DAL.Entities.Role;

import java.util.concurrent.CompletableFuture;

public interface IRoleService extends IBaseService<Role, Long>{
    public Role getByName(String name);
    public CompletableFuture<Role> getByNameAsync(String name);
}
