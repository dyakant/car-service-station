package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Car;
import com.gitant.sfdservicestation.model.Owner;
import com.gitant.sfdservicestation.services.CarService;
import com.gitant.sfdservicestation.services.CarTypeService;
import com.gitant.sfdservicestation.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
@Service
public class OwnerMapService
        extends AbstractMapService<Owner, Long>
        implements OwnerService {

    private final CarTypeService carTypeService;
    private final CarService carService;

    public OwnerMapService(CarTypeService carTypeService, CarService carService) {
        this.carTypeService = carTypeService;
        this.carService = carService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getCars() != null) {
                object.getCars().forEach(car -> {
                    if (car.getCarType() != null) {
                        if (car.getCarType().getId() == null) {
                            car.setCarType(carTypeService.save(car.getCarType()));
                        }
                    } else {
                        throw new RuntimeException("Car Type is required");
                    }

                    if (car.getId() == null) {
                        Car savedCar = carService.save(car);
                        car.setId(savedCar.getId());
                    }
                });
            }

            return super.save(object);

        } else {
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
