package com.gitant.sfdservicestation.services;

import com.gitant.sfdservicestation.model.Car;

import java.util.Set;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public interface CarService {
    
    Car findById(Long id);

    Car save(Car Car);

    Set<Car> findAll();

}
