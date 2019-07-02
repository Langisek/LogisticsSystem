/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.restcontrollers;

import com.langi.logisticssystem.entities.Dodavatel;
import com.langi.logisticssystem.repositories.DodavatelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david.langer
 */
@RestController
public class DodavatelController {
    
    @Autowired
    DodavatelRepository dodavatelRepository;
    
    @PostMapping("/dodavatele")
    private long saveDodavatel(@RequestBody Dodavatel dodavatel)
    {
        dodavatelRepository.save(dodavatel);
        return dodavatel.getId();
    }
}
