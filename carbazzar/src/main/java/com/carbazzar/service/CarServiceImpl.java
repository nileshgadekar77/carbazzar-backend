package com.carbazzar.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.carbazzar.repository.CarRepository;
import com.carbazzar.model.Car;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public Car updateCar(Long id, Car carDetails) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            car.setMake(carDetails.getMake());
            car.setModel(carDetails.getModel());
           // car.setYear(carDetails.getYear());
         //   car.setPrice(carDetails.getPrice());
            // Add other fields as needed
            return carRepository.save(car);
        } else {
            throw new RuntimeException("Car not found with id " + id);
        }
    }
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
