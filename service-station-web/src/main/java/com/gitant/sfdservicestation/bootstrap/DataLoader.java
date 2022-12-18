package com.gitant.sfdservicestation.bootstrap;

import com.gitant.sfdservicestation.model.*;
import com.gitant.sfdservicestation.services.CarTypeService;
import com.gitant.sfdservicestation.services.MechanicService;
import com.gitant.sfdservicestation.services.OwnerService;
import com.gitant.sfdservicestation.services.SpecialityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Anton Dyakov on 14.12.2022
 */
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final MechanicService mechanicService;
    private final CarTypeService carTypeService;
    private final SpecialityService specialityService;

    public DataLoader(
            OwnerService ownerService,
            MechanicService mechanicService,
            CarTypeService carTypeService,
            SpecialityService specialityService
    ) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
        this.carTypeService = carTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) {
        int count = carTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        CarType dodge = new CarType("Dodge");
        CarType savedDodgeCarType = carTypeService.save(dodge);
        CarType ford = new CarType("Ford");
        CarType savedFordCarType = carTypeService.save(ford);
        CarType bmw = new CarType("Dodge");
        CarType savedBmw = carTypeService.save(bmw);
        System.out.println("CarType loaded.");

        Speciality generalRepair = new Speciality("General Repair");
        var savedGeneralRepair = specialityService.save(generalRepair);
        var autoBody = new Speciality("Auto Body");
        var savedAutoBody = specialityService.save(autoBody);
        System.out.println("Specialities loaded");

        Owner owner1 = new Owner("Anton", "Dyakov", "51 Begalina", "Almaty", "+7954879213213");
        Car car1 = new Car(savedBmw, "X238TH178", owner1, LocalDate.of(2020, 10, 12));
        owner1.getCars().add(car1);
        ownerService.save(owner1);
        Owner owner2 = new Owner("Ivanov", "Oleg", "17-2 Zaslonova", "Moscow", "+76626548686512");
        Car car2 = new Car(ford, "O111PO177", owner2, LocalDate.of(2012, 3, 22));
        owner2.getCars().add(car2);
        ownerService.save(owner2);
        System.out.println("Owners loaded.");

        var mechanic1 = new Mechanic("Petrov", "Michalich");
        mechanic1.getSpecialities().add(savedAutoBody);
        mechanicService.save(mechanic1);
        var mechanic2 = new Mechanic("Muhidov", "Ibragim");
        mechanic2.getSpecialities().add(savedGeneralRepair);
        mechanicService.save(mechanic2);
        System.out.println("Mechanics loaded.");
    }
}
