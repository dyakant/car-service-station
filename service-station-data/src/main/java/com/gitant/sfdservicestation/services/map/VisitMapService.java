package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Visit;
import com.gitant.sfdservicestation.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
@Service
public class VisitMapService
        extends AbstractMapService<Visit, Long>
        implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if (object == null || object.getCar() == null || object.getCar().getId() == null
                || object.getCar().getOwner() == null || object.getCar().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
