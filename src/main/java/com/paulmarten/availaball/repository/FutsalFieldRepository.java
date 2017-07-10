package com.paulmarten.availaball.repository;

import com.paulmarten.availaball.model.FutsalField;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by paulms on 7/4/2017.
 */
@Repository("futsalfieldRepository")
public interface FutsalFieldRepository extends DataTablesRepository<FutsalField, Integer> {
}
