package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.Mechanic;
import com.gitant.sfdservicestation.services.MechanicService;
import com.gitant.sfdservicestation.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
@Service
public class MechanicMapService
        extends AbstractMapService<Mechanic, Long>
        implements MechanicService {

    private final SpecialityService specialityService;

    public MechanicMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(spec -> {
                if (spec.getDescription() != null) {
                    if (spec.getId() == null) {
                        var savedSpec = specialityService.save(spec);
                        spec.setId(savedSpec.getId());
                    }
                } else {
                    throw new RuntimeException("Speciality's description cannot be null");
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Mechanic findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Mechanic findByLastName(String lastName) {
        return null;
    }
}
