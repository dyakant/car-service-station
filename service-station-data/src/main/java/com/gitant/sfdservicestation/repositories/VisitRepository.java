package com.gitant.sfdservicestation.repositories;

import com.gitant.sfdservicestation.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anton Dyakov on 27.12.2022
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
