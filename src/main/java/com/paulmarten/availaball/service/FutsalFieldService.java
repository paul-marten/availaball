package com.paulmarten.availaball.service;

import com.paulmarten.availaball.model.FutsalField;
import com.paulmarten.availaball.repository.FutsalFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by paulms on 6/20/2017.
 */
@Service
public class FutsalFieldService {

    @Autowired
    private FutsalFieldRepository futsalFieldRepository;

    public List<FutsalField> getAllFutsalField() {
        return futsalFieldRepository.findAll();
    }
}
