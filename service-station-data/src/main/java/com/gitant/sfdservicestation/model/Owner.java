package com.gitant.sfdservicestation.model;

import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Owner extends Person {

    private Set<Car> cars;

    public Owner(String name, String surname) {
        this.setFirstName(name);
        this.setLastName(surname);
    }
}
