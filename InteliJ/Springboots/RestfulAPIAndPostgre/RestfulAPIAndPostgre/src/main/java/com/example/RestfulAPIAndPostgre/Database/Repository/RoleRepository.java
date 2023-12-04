package com.example.RestfulAPIAndPostgre.Database.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Optional<Role> findByRoleName(String roleName);
}
