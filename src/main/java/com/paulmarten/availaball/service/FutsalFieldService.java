package com.paulmarten.availaball.service;

import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by paulms on 7/4/2017.
 */
@Service("futsalfieldService")
public class FutsalFieldService {

    @Autowired
    private FutsalFieldRepository futsalFieldRepository;

    public DataTablesOutput<FutsalField> getFutsalFields(@Valid DataTablesInput input) {
        return futsalFieldRepository.findAll(input);
=======
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulms on 6/20/2017.
 */
@Service
public class FutsalFieldService {
    @Autowired
    private FutsalFieldRepository futsalFieldRepository;

//    public List<FutsalField> findAllFutsalField(){
//        List<FutsalField> futsalFields = new ArrayList<>();
//        for(FutsalField futsalField : futsalFieldRepository.findAll()) {
//            futsalFields.add(futsalField);
//        }
//        return futsalFields;
//    }

    public List<FutsalField> findAllFutsalField(){
        return futsalFieldRepository.findAll();
>>>>>>> cb2b1b34f3f0d33cb90ae3cb0e5381dae788d362
    }
}
