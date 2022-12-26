package com.gitant.sfdservicestation.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * Simple JavaBean domain object representing a person
 *
 * @author Anton Dyakov
 */
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
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
