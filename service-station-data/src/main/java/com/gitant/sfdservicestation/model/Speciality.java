package com.gitant.sfdservicestation.model;

/**
 * Created by Anton Dyakov on 18.12.2022
 */
public class Speciality extends BaseEntity {
    private String description;

    public Speciality(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
