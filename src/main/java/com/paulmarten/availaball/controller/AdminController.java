package com.paulmarten.availaball.controller;

import com.paulmarten.availaball.model.Account;
import com.paulmarten.availaball.repository.SurveyerRepository;
import com.paulmarten.availaball.service.SurveyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulms on 6/14/2017.
 */
@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    private SurveyerService surveyerService;

    @Autowired
    private SurveyerRepository surveyerRepository;

    @RequestMapping("/admin")
    public String index(){
        return "admin/index";
    }

    @RequestMapping("/user")
    public String user(){
        return "admin/user";
    }
}
