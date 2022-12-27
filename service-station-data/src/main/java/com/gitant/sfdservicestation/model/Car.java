package com.gitant.sfdservicestation.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Entity
@Table(name = "cars")
public class Car extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "type_id")
    private CarType carType;
    @Column(name = "car_type")
    private String number;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @Column(name = "create_date")
    private LocalDate createDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    public Car() {

    }

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

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
