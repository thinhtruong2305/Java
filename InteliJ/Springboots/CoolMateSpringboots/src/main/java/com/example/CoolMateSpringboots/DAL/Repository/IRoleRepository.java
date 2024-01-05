package com.example.CoolMateSpringboots.DAL.Repository;

import com.example.CoolMateSpringboots.DAL.Entities.Role;
import com.example.CoolMateSpringboots.DAL.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    public Optional<Role> findByRoleName(String roleName);
}
