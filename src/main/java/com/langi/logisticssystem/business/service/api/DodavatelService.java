/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.business.service.api;

import com.langi.logisticssystem.dto.DodavatelBean;
import java.util.List;
/**
 *
 * @author david.langer
 */
public interface DodavatelService {
    
    public DodavatelBean vytvorDodavatele(DodavatelBean dodavatel);
    
    public List<DodavatelBean> vypisSeznamDodavatelu();
    
    public DodavatelBean vypisDodavatele(Long idDodavatel);
    
}
