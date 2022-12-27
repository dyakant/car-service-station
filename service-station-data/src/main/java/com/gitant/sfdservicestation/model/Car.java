package com.gitant.sfdservicestation.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "car")
    private Set<Visit> visits = new HashSet<>();

    public Car(CarType savedBmw, String x238TH178, Owner owner1, LocalDate of) {

    }
}
