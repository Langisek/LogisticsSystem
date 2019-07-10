/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.business.service.implementation;

import com.langi.logisticssystem.business.service.api.DodavatelService;
import com.langi.logisticssystem.dto.DodavatelBean;
import com.langi.logisticssystem.entities.Dodavatel;
import org.springframework.beans.factory.annotation.Autowired;
import com.langi.logisticssystem.repositories.DodavatelRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 *
 * @author david.langer
 */
@Service
public class DodavatelServiceImpl implements DodavatelService {
    
    @Autowired
    private DodavatelRepository dodavatelRepository;
    
    @Override
    public DodavatelBean vytvorDodavatele(DodavatelBean dodavatelBean)
    {
        Dodavatel dodavatel = new Dodavatel();
        BeanUtils.copyProperties(dodavatelBean, dodavatel);

        Dodavatel ulozenyDodavatel = dodavatelRepository.save(dodavatel);
        DodavatelBean mappedDodavatel = new DodavatelBean();
        BeanUtils.copyProperties(ulozenyDodavatel, mappedDodavatel);
        return mappedDodavatel;
    }

    @Override
    public List<DodavatelBean> vypisSeznamDodavatelu() {
        
        List<Dodavatel> dodavatele = (List<Dodavatel>) dodavatelRepository.findAll();
        List<DodavatelBean> dodavateleBean = new ArrayList<>();
        
        for(Dodavatel dod: dodavatele)
        {
             DodavatelBean dodavatelBean= new DodavatelBean();
             BeanUtils.copyProperties(dod, dodavatelBean);
             dodavateleBean.add(dodavatelBean);
        }
        
        return dodavateleBean;
    }
}
