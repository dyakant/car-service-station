package com.gitant.sfdservicestation.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mechanics")
public class Mechanic extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "mechanics_specialities",
            joinColumns = @JoinColumn(name = "mechanic_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Mechanic(String name, String surname) {
        this.setFirstName(name);
        this.setLastName(surname);
    }
}
