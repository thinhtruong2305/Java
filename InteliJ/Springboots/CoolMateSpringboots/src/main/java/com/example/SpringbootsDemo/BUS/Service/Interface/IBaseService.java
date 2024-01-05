package com.example.CoolMateSpringboots.BUS.Service.Interface;

import org.springframework.data.util.Streamable;

import java.util.concurrent.CompletableFuture;

public interface IBaseService<T, ID> {
    public Streamable<T> getAll();
    public CompletableFuture<Streamable<T>> getAllAsync();
    public T getById(ID id);
    public CompletableFuture<T> getByIdAsync(ID id);
    public T saveEntity(T entity);
    public CompletableFuture<T> saveEntityAsync(T entity);
    public boolean removeById(ID id);
    public CompletableFuture<Boolean> removeByIdAsync(ID id);
    public boolean removeByEntity(T entity);
    public CompletableFuture<Boolean> removeByEntityAsync(T entity);

}
