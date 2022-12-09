package com.gitant.sfdservicestation.model;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class CarType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
