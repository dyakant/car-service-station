package com.gitant.sfdservicestation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

/**
 * Created by Anton Dyakov on 08.12.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class CarType extends BaseEntity {
    private String name;
}
