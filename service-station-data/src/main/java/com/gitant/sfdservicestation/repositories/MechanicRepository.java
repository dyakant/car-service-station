package com.gitant.sfdservicestation.repositories;

import com.gitant.sfdservicestation.model.Mechanic;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
public interface MechanicRepository extends CrudRepository<Mechanic, Long> {
    Optional<Mechanic> findByLastName(String name);
}
