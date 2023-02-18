package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository after a version dont need to put it here
public interface CarRepository extends JpaRepository<Car, Long> {
}
