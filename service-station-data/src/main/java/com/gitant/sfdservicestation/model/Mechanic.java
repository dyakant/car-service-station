package com.gitant.sfdservicestation.model;

import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Mechanic extends Person {
    private Set<Speciality> specialities;

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
