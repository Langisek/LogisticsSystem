package com.langi.logisticssystem.business.service.api;

import com.langi.logisticssystem.dto.PobockaBean;
import com.langi.logisticssystem.dto.PobockaFilterBean;
import java.util.List;

/**
 *
 * @author david.langer
 */
public interface PobockaService {
    
    public PobockaBean vytvorPobocku(Long dodavatelId, PobockaBean pobocka);
    public List<PobockaBean> vypisSeznamPobocek(PobockaFilterBean filtr, Integer start, Integer pocet, List<String> razeni);
    public List<PobockaBean> vypisSeznamPobocekDodavatele(Long dodavatelId);
}
