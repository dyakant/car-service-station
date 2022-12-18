package com.gitant.sfdservicestation.model;

import java.time.LocalDate;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Car extends BaseEntity {
    private CarType carType;
    private String number;
    private Owner owner;
    private LocalDate createDate;

    public Car(CarType carType, String number, Owner owner, LocalDate date) {
        this.carType = carType;
        this.number = number;
        this.owner = owner;
        this.createDate = date;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
