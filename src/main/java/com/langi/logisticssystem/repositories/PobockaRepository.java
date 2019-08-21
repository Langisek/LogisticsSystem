/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.repositories;

import com.langi.logisticssystem.entities.Pobocka;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author david.langer
 */
public interface PobockaRepository extends CrudRepository<Pobocka, Long>{
    
    @Query("select p from Pobocka p where p.dodavatelPobocky.id = :dodavatelId")
    public List<Pobocka> findAllByDodavatelId(@Param("dodavatelId") Long dodavatelId);
    
    
}
