package com.nogayhusrev.repository;

import com.nogayhusrev.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


}
