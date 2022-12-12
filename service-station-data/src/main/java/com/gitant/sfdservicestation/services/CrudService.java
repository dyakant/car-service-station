package com.gitant.sfdservicestation.services;

import java.util.Set;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
