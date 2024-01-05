package com.example.CoolMateSpringboots.DAL.Repository;

import com.example.CoolMateSpringboots.DAL.Entities.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailRepository extends JpaRepository<Detail, Long> {
}
