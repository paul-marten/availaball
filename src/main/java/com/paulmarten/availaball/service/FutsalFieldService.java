package com.paulmarten.availaball.service;

import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    }
}
