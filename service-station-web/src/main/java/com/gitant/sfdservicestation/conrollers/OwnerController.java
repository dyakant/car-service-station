package com.gitant.sfdservicestation.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"/index", "", "/"})
    public String listOwners() {
        return "owners";
    }
}
