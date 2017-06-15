package com.paulmarten.availaball.controller;

import com.paulmarten.availaball.model.Account;
import com.paulmarten.availaball.service.SurveyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by paulms on 6/14/2017.
 */
@RestController
@RequestMapping("/surveyer")
public class RESTSurveyerController {
    @Autowired
    private SurveyerService surveyerService;

    @RequestMapping(value = "/getid/{id}" , method = RequestMethod.POST , headers="Accept=application/json")
    public Account getId(@PathVariable int id){
        return surveyerService.getAccount(id);
    }

    @RequestMapping(value="/login/{username}/{password}", method = RequestMethod.POST)
    public String loginAccount(@PathVariable String username, @PathVariable String password){
//        return "Username anda =" + username + " password =" + password;
        return surveyerService.checkAccount(username,password);
    }

}
