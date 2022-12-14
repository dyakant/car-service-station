package com.gitant.sfdservicestation.model;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Mechanic extends Person {
    public Mechanic(String name, String surname) {
        this.setFirstName(name);
        this.setLastName(surname);
    }
}
