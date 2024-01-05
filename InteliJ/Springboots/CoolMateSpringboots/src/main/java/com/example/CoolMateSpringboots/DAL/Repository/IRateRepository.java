package com.example.CoolMateSpringboots.DAL.Repository;

import com.example.CoolMateSpringboots.DAL.Entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRateRepository extends JpaRepository<Rate, Long> {
}
