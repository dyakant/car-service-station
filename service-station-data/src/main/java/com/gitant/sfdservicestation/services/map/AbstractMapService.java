package com.gitant.sfdservicestation.services.map;

import com.gitant.sfdservicestation.model.BaseEntity;

import java.util.*;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("object cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(en -> en.getValue().equals(object));
    }

    private Long getNextId() {
        return map.size() == 0 ? 1L : Collections.max(map.keySet()) + 1;
    }

}
