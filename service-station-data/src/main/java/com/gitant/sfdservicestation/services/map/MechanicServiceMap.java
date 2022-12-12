package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Mechanic;
import com.gitant.sfdservicestation.services.CrudService;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
public class MechanicServiceMap
        extends AbstractMapService<Mechanic, Long>
        implements CrudService<Mechanic, Long> {
    @Override
    public Set<Mechanic> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Mechanic object) {
        super.delete(object);
    }

    @Override
    public Mechanic save(Mechanic object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Mechanic findById(Long id) {
        return super.findById(id);
    }
}
