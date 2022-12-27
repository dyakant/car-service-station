package com.gitant.sfdservicestation.services.springdatajpa;

import com.gitant.sfdservicestation.model.Car;
import com.gitant.sfdservicestation.repositories.CarRepository;
import com.gitant.sfdservicestation.services.CarService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
@Service
@Profile("springdatajpa")
public class CarSDJpaService implements CarService {
    private final CarRepository carRepository;

    public CarSDJpaService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Set<Car> findAll() {
        Set<Car> cars = new HashSet<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car save(Car object) {
        return carRepository.save(object);
    }

    @Override
    public void delete(Car object) {
        carRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}
