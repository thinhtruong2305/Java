package com.example.RestfulAPIAndPostgre.Database.Repository;

import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.util.Streamable;
import org.springframework.graphql.data.GraphQlRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@GraphQlRepository
public interface LicenseRepository extends JpaRepository<License, Long> {
    Optional<License> findByLicenseName(String licenseName);
    Optional<License> findByUser_UserId(long userId);
    Streamable<License> findByKeywordContaining(String keyword);
}
