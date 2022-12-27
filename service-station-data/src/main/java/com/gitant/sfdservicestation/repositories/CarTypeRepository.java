package com.gitant.sfdservicestation.repositories;

import com.gitant.sfdservicestation.model.CarType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
public interface CarTypeRepository extends CrudRepository<CarType, Long> {
}
