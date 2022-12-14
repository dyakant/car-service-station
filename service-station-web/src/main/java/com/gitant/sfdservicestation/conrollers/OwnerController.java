package com.gitant.sfdservicestation.conrollers;

import com.gitant.sfdservicestation.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/index", "", "/"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners";
    }
}
