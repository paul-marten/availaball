package com.paulmarten.availaball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paulms on 6/14/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/dashboard")
    public String home(){
        return "admin/layout";
    }
}
