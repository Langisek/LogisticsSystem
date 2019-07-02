/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.repositories;

import com.langi.logisticssystem.entities.Dodavatel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author david.langer
 */
public interface DodavatelRepository extends CrudRepository<Dodavatel, Long>{
    
    List<Dodavatel> findAllByNazev(String nazev);
    
}
