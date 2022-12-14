package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Car;
import com.gitant.sfdservicestation.services.CarService;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
public class CarServiceMap
        extends AbstractMapService<Car, Long>
        implements CarService {
    @Override
    public Set<Car> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Car object) {
        super.delete(object);
    }

    @Override
    public Car save(Car object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Car findById(Long id) {
        return super.findById(id);
    }
}
