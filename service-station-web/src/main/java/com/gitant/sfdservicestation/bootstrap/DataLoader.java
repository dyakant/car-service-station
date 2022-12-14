package com.gitant.sfdservicestation.bootstrap;

import com.gitant.sfdservicestation.model.Mechanic;
import com.gitant.sfdservicestation.model.Owner;
import com.gitant.sfdservicestation.services.MechanicService;
import com.gitant.sfdservicestation.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Anton Dyakov on 14.12.2022
 */
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final MechanicService mechanicService;

    public DataLoader(OwnerService ownerService, MechanicService mechanicService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner("Anton", "Dyakov");
        ownerService.save(owner1);
        Owner owner2 = new Owner("Ivanov", "Oleg");
        ownerService.save(owner2);
        System.out.println("Owners loaded.");

        var mechanic1 = new Mechanic("Petrov", "Michalich");
        mechanicService.save(mechanic1);
        var mechanic2 = new Mechanic("Muhidov", "Ibragim");
        mechanicService.save(mechanic2);
        System.out.println("Mechanics loaded.");
    }
}
