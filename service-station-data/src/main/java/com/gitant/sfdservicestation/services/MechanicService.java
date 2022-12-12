package com.gitant.sfdservicestation.services;

import com.gitant.sfdservicestation.model.Mechanic;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public interface MechanicService extends CrudService<Mechanic, Long> {
    Mechanic findByLastName(String lastName);

}
