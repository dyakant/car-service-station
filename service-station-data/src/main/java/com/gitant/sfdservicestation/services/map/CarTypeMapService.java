package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.CarType;
import com.gitant.sfdservicestation.services.CarTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Anton Dyakov on 18.12.2022
 */
@Service
public class CarTypeMapService
        extends AbstractMapService<CarType, Long>
        implements CarTypeService {

    @Override
    public Set<CarType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(CarType object) {
        super.delete(object);
    }

    @Override
    public CarType save(CarType object) {
        return super.save(object);
    }

    @Override
    public CarType findById(Long id) {
        return super.findById(id);
    }
}
