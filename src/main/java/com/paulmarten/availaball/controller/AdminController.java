package com.paulmarten.availaball.controller;

import com.paulmarten.availaball.model.FutsalField;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.security.Principal;

/**
 * Created by paulms on 6/14/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(path="/index", method= RequestMethod.GET)
    public String goIndex(){
        return "/admin/index";
    }


//    @RequestMapping(path="/index", method= RequestMethod.GET)
//    public String goIndex(@Valid FutsalField futsalField, Model model, Principal p){
//        model.addAttribute("ffield", futsalFieldService.find);
//        return "/admin/index";
//    }
    @RequestMapping(path="/index2", method= RequestMethod.GET)
    public String goIndex2(){
        return "/index";
    }

    @RequestMapping(path="/user", method= RequestMethod.GET)
    public String goUser(){
        return "/admin/user";
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logout(){
        return "redirect:/";
    }
}
