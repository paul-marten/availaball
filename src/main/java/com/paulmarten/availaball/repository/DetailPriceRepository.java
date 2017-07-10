package com.paulmarten.availaball.repository;

import com.paulmarten.availaball.model.Account;
import com.paulmarten.availaball.model.DetailPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by paulms on 6/16/2017.
 */
@Repository
public interface DetailPriceRepository extends JpaRepository<DetailPrice, Integer> {
}
