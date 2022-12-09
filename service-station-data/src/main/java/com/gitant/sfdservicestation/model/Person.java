package com.gitant.sfdservicestation.model;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
