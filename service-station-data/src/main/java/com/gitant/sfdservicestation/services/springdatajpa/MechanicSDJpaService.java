package com.gitant.sfdservicestation.services.springdatajpa;

import com.gitant.sfdservicestation.model.Mechanic;
import com.gitant.sfdservicestation.repositories.MechanicRepository;
import com.gitant.sfdservicestation.services.MechanicService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
@Service
@Profile("springdatajpa")
public class MechanicSDJpaService implements MechanicService {
    private final MechanicRepository mechanicRepository;

    public MechanicSDJpaService(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    @Override
    public Set<Mechanic> findAll() {
        Set<Mechanic> mechanics = new HashSet<>();
        mechanicRepository.findAll().forEach(mechanics::add);
        return mechanics;
    }

    @Override
    public Mechanic findById(Long id) {
        return mechanicRepository.findById(id).orElse(null);
    }

    @Override
    public Mechanic save(Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }

    @Override
    public void delete(Mechanic mechanic) {
        mechanicRepository.delete(mechanic);
    }

    @Override
    public void deleteById(Long id) {
        mechanicRepository.deleteById(id);
    }

    @Override
    public Mechanic findByLastName(String lastName) {
        return mechanicRepository.findByLastName(lastName).orElse(null);
    }
}
