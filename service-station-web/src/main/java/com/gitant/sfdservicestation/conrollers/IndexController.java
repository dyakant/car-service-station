package com.gitant.sfdservicestation.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anton Dyakov on 12.12.2022
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index"})
    public String index() {
        return "index";
    }
}
