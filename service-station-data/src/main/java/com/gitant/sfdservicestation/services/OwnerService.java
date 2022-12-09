package com.gitant.sfdservicestation.services;

import com.gitant.sfdservicestation.model.Owner;

import java.util.Set;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
