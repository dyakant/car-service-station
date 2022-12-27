package com.gitant.sfdservicestation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

/**
 * Created by Anton Dyakov on 18.12.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

}
