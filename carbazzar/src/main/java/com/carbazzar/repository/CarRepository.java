package com.carbazzar.repository;

import com.carbazzar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Add custom query methods if needed
}