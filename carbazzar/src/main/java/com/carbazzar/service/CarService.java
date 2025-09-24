package com.carbazzar.service;

import com.carbazzar.model.Car;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CarService {

    List<Car> getAllCars();

    Car getCarById(Long id);

    Car addCar(Car car);

    Car updateCar(Long id, Car car);

    void deleteCar(Long id);
}
