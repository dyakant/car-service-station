package com.gitant.sfdservicestation.model;

import java.time.LocalDate;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Car {
    private CarType carType;
    private Owner owner;
    private LocalDate createDate;

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
