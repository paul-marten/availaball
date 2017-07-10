package com.paulmarten.availaball.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.paulmarten.availaball.ViewJSON;
import com.paulmarten.availaball.model.Account;
import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import com.paulmarten.availaball.service.FutsalFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulms on 7/4/2017.
 */
@RestController
public class AdminRestController {

    @Autowired
    private FutsalFieldRepository futsalFieldRepository;

    @Autowired
    private FutsalFieldService futsalFieldService;

//    @JsonView(ViewJSON.FutsalFieldView.class)
//    @RequestMapping(path="/futsalfields", method= RequestMethod.GET)
//    public List<FutsalField> getAllEmployees(){
//        return futsalFieldService.getAllFutsalField();
//    }

//    @JsonView(DataTablesOutput.View.class)
//    @RequestMapping(value = "/futsalfields", method = RequestMethod.GET)
//    public DataTablesOutput<FutsalField> getFutsalFields(@Valid DataTablesInput input) {
//        return futsalFieldRepository.findAll(input);
//    }

    @JsonView(DataTablesOutput.View.class)
    @RequestMapping(value = "/futsalfields", method = RequestMethod.GET)
    public DataTablesOutput<FutsalField> getFutsalFields(@Valid DataTablesInput input) {
        return futsalFieldService.getFutsalFields(input);
    }

//    @PostConstruct
//    public void insertSampleData() {
//        List<FutsalField> futsalFields = new ArrayList<FutsalField>();
//        for (int i = 0; i < 4; i++) {
//            FutsalField futsalField = new FutsalField();
//            futsalField = futsalFieldRepository.save(futsalField);
//            futsalFields.add(futsalField);
//        }
//    }
}
