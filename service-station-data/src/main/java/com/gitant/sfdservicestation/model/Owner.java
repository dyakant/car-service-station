package com.gitant.sfdservicestation.model;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Owner extends Person {
    public Owner(Long id, String name, String surname) {
        this.setId(id);
        this.setFirstName(name);
        this.setLastName(surname);
    }
}
