package com.gitant.sfdservicestation.repositories;

import com.gitant.sfdservicestation.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
public interface CarRepository extends CrudRepository<Car, Long> {
}
