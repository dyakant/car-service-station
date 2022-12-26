package com.gitant.sfdservicestation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Entity
@Table(name = "types")
public class CarType extends BaseEntity {
    private String name;

    public CarType() {
    }

    public CarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
