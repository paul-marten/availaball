package com.paulmarten.availaball.repository;

import com.paulmarten.availaball.model.FutsalField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by paulms on 6/16/2017.
 */
@Repository
public interface FutsalFieldRepository extends JpaRepository<FutsalField, Integer> {
}
