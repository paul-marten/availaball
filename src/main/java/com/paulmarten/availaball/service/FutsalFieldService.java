package com.paulmarten.availaball.service;

import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    }
}
