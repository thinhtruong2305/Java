package com.example.RestfulAPIAndPostgre.Database.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    Optional<User> findByUserNameOrEmail(String userName, String email);
    Optional<User> findByUserNameAndEmailAllIgnoreCase(String userName, String email);
}
