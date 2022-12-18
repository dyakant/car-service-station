package com.gitant.sfdservicestation.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Car> cars = new HashSet<>();

    public Owner(String name, String surname, String address, String city, String telephone) {
        this.setFirstName(name);
        this.setLastName(surname);
        this.setAddress(address);
        this.setCity(city);
        this.setTelephone(telephone);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
