package com.gitant.sfdservicestation.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Entity
@Table(name = "mechanics")
public class Mechanic extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "mechanics_specialities",
            joinColumns = @JoinColumn(name = "mechanic_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Mechanic() {
    }

    public Mechanic(String name, String surname) {
        this.setFirstName(name);
        this.setLastName(surname);
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
