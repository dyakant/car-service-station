package com.gitant.sfdservicestation.services;

import com.gitant.sfdservicestation.model.Owner;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
