package com.gitant.sfdservicestation.model;

import java.io.Serializable;

/**
 * Created by Anton Dyakov on 09.12.2022
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
