package com.paulmarten.availaball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by paulms on 6/14/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String home(){
        return "/admin/dashboard";
    }
}
