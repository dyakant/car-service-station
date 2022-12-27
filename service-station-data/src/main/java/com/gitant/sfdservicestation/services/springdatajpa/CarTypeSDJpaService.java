package com.gitant.sfdservicestation.services.springdatajpa;

import com.gitant.sfdservicestation.model.CarType;
import com.gitant.sfdservicestation.repositories.CarTypeRepository;
import com.gitant.sfdservicestation.services.CarTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
@Service
@Profile("springdatajpa")
public class CarTypeSDJpaService implements CarTypeService {
    private final CarTypeRepository carTypeRepository;

    public CarTypeSDJpaService(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    @Override
    public Set<CarType> findAll() {
        Set<CarType> carTypes = new HashSet<>();
        carTypeRepository.findAll().forEach(carTypes::add);
        return carTypes;
    }

    @Override
    public CarType findById(Long id) {
        return carTypeRepository.findById(id).orElse(null);
    }

    @Override
    public CarType save(CarType object) {
        return carTypeRepository.save(object);
    }

    @Override
    public void delete(CarType object) {
        carTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        carTypeRepository.deleteById(id);
    }
}
