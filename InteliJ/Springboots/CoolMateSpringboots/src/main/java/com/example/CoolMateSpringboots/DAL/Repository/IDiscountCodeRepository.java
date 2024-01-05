package com.example.CoolMateSpringboots.DAL.Repository;

import com.example.CoolMateSpringboots.DAL.Entities.DiscountCode;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDiscountCodeRepository extends JpaRepository<DiscountCode, Long> {
}
