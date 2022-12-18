package com.gitant.sfdservicestation.model;

import java.time.LocalDate;

/**
 * Created by Anton Dyakov on 18.12.2022
 */
public class Visit {
    private LocalDate date;
    private String description;
    private Car car;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
