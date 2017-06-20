package com.paulmarten.availaball.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.paulmarten.availaball.ViewJSON;
import com.paulmarten.availaball.model.Account;
import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import com.paulmarten.availaball.service.FutsalFieldService;
import com.paulmarten.availaball.service.SurveyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by paulms on 6/14/2017.
 */
@RestController
@RequestMapping("/surveyer")
public class SurveyerController {
    @Autowired
    private SurveyerService surveyerService;

    @Autowired
    private FutsalFieldService futsalFieldService;

    @JsonView(ViewJSON.AccountView.class)
    @RequestMapping(value = "/getid/{id}" , method = RequestMethod.POST , headers="Accept=application/json")
    public Account getId(@PathVariable int id){
        return surveyerService.getAccount(id);
    }

    @RequestMapping(value="/login/{username}/{password}", method = RequestMethod.POST)
    public String loginAccount(@PathVariable String username, @PathVariable String password){
        return surveyerService.checkAccount(username,password);
    }

//    @RequestMapping(value="/getallfutsalfield", method = RequestMethod.POST , headers="Accept=application/json")
//    public List<FutsalField> getAllFutsalField(){
//        return futsalFieldService.findAllFutsalField();
//    }

    @JsonView(ViewJSON.FutsalFieldView.class)
    @RequestMapping(value="/getallfutsalfield", method = RequestMethod.POST , headers="Accept=application/json")
    public List<FutsalField> getAllFutsalField(){
        return futsalFieldService.findAllFutsalField();
    }
}
