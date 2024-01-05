package com.example.CoolMateSpringboots.DAL.Repository;

import com.example.CoolMateSpringboots.DAL.Entities.ProductCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCriteriaRepository extends JpaRepository<ProductCriteria, Long> {
}
