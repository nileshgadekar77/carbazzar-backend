package com.carbazzar.controller;

import org.springframework.web.bind.annotation.RestController;

import com.carbazzar.model.Car;
import com.carbazzar.service.CarServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping
    public Object getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Object getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PostMapping
    public Object createCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/{id}")
    public Object updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    /*
    @PatchMapping("/{id}")
    public Object partiallyUpdateCar(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return carService.partiallyUpdateCar(id, updates);
    }

    */

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
         carService.deleteCar(id);
    }
}