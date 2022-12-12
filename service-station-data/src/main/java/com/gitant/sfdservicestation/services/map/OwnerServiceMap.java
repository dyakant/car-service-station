package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Owner;
import com.gitant.sfdservicestation.services.CrudService;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long> {

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
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
