package com.langi.logisticssystem.business.service.implementation;

import com.langi.logisticssystem.business.service.api.PobockaService;
import com.langi.logisticssystem.dto.PobockaBean;
import com.langi.logisticssystem.dto.PobockaFilterBean;
import com.langi.logisticssystem.entities.Pobocka;
import com.langi.logisticssystem.repositories.DodavatelRepository;
import com.langi.logisticssystem.repositories.PobockaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david.langer
 */
@Service
public class PobockaServiceImpl implements PobockaService{

    @Autowired
    private DodavatelRepository dodavatelRepository;
    
    @Autowired
    private PobockaRepository pobockaRepository;
    
    @Override
    public PobockaBean vytvorPobocku(Long dodavatelId, PobockaBean pobockaBean) 
    {
        Pobocka pobocka = new Pobocka();
        BeanUtils.copyProperties(pobockaBean, pobocka);
        pobocka.setDodavatelPobocky(dodavatelRepository.findById(dodavatelId).get());
        
        Pobocka ulozenaPobocka = pobockaRepository.save(pobocka);
        PobockaBean mappedPobocka = new PobockaBean();
        BeanUtils.copyProperties(ulozenaPobocka, mappedPobocka);
        
        return mappedPobocka;
    }
    
    @Override
    public List<PobockaBean> vypisSeznamPobocek(PobockaFilterBean filtr, Integer start, Integer pocet, List<String> razeni) 
    {
        return null;
    }
    
    @Override
    public List<PobockaBean> vypisSeznamPobocekDodavatele(Long dodavatelId) 
    {
        List<Pobocka> pobocky = pobockaRepository.findAllByDodavatelId(dodavatelId);
        List<PobockaBean> pobockyBean = new ArrayList<>();
        
        for(Pobocka pob: pobocky)
        {
             PobockaBean pobockaBean= new PobockaBean();
             BeanUtils.copyProperties(pob, pobockaBean);
             pobockyBean.add(pobockaBean);
        }
        
        return pobockyBean;
    }

    
    
}
