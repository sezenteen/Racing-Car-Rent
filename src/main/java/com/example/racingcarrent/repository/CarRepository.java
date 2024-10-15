package com.example.racingcarrent.repository;

import com.example.racingcarrent.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarById();
}
