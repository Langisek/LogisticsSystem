/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.restcontrollers;

import com.langi.logisticssystem.business.service.api.DodavatelService;
import com.langi.logisticssystem.dto.DodavatelBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david.langer
 */
@RestController
public class DodavatelController {
    
    @Autowired
    private DodavatelService dodavatelService;
    
    @RequestMapping(value = "/dodavatele/vytvorit", method = RequestMethod.POST)
    public ResponseEntity<DodavatelBean> saveDodavatel(@RequestBody DodavatelBean dodavatel)
    {
        System.out.println("nazev je: " + dodavatel.getNazev());
        DodavatelBean dodavatelBean = dodavatelService.vytvorDodavatele(dodavatel);
        return new ResponseEntity<>(dodavatelBean, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/dodavatele/seznam", method = RequestMethod.GET)
    public ResponseEntity<List<DodavatelBean>> vypisSeznamDodavatelu()
    {
        return new ResponseEntity<>(dodavatelService.vypisSeznamDodavatelu(), HttpStatus.OK);
    }
}
