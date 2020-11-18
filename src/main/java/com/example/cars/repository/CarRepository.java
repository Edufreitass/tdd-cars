package com.example.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.models.Car;

/**
 * The interface Car repository.
 * 
 * @author Eduardo
 */
public interface CarRepository extends JpaRepository<Car, Long> {

}
