package com.gitant.sfdservicestation.services;

import com.gitant.sfdservicestation.model.Mechanic;

import java.util.Set;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public interface MechanicService {
    Mechanic findByLastName(String lastName);

    Mechanic findById(Long id);

    Mechanic save(Mechanic Mechanic);

    Set<Mechanic> findAll();

}
