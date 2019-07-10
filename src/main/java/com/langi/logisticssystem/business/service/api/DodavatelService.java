/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.business.service.api;

import com.langi.logisticssystem.dto.DodavatelBean;
import com.langi.logisticssystem.entities.Dodavatel;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author david.langer
 */
public interface DodavatelService {
    
    public DodavatelBean vytvorDodavatele(DodavatelBean dodavatel);
    
    public List<DodavatelBean> vypisSeznamDodavatelu();
    
}
