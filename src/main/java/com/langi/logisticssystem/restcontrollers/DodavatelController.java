package com.langi.logisticssystem.restcontrollers;

import com.langi.logisticssystem.business.service.api.DodavatelService;
import com.langi.logisticssystem.dto.DodavatelBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping(value = "/dodavatel/vytvorit", method = RequestMethod.POST)
    public ResponseEntity<DodavatelBean> vytvorDodavatele(@RequestBody DodavatelBean dodavatel)
    {
        DodavatelBean dodavatelBean = dodavatelService.vytvorDodavatele(dodavatel);
        return new ResponseEntity<>(dodavatelBean, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/dodavatel/seznam", method = RequestMethod.GET)
    public ResponseEntity<List<DodavatelBean>> vypisSeznamDodavatelu()
    {
        return new ResponseEntity<>(dodavatelService.vypisSeznamDodavatelu(), HttpStatus.OK);
    }
    
    @RequestMapping(value = {"/dodavatel/{idDodavatel}"}, produces = {"application/json"}, method = {RequestMethod.GET})
    public ResponseEntity<DodavatelBean> vypisDodavatele(@PathVariable(value="idDodavatel") Long idDodavatel)
    {
        return new ResponseEntity<>(dodavatelService.vypisDodavatele(idDodavatel), HttpStatus.OK);
    }
}
