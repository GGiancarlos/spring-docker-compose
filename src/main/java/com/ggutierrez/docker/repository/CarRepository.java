package com.ggutierrez.docker.repository;

import com.ggutierrez.docker.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
