package com.langi.logisticssystem.restcontrollers;

import com.langi.logisticssystem.business.service.api.PobockaService;
import com.langi.logisticssystem.dto.PobockaBean;
import java.util.List;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david.langer
 */
@RestController
@Validated
public class PobockaController {
    
    @Autowired
    private PobockaService pobockaService;
    
    @RequestMapping(value = "/pobocky/vytvorit/{dodavatelId}", method = RequestMethod.POST)
    public ResponseEntity<PobockaBean> vytvorPobocku(@RequestParam("dodavatelId") Long dodavatelId, @RequestBody PobockaBean pobocka)
    {
        
            PobockaBean pobockaBean = pobockaService.vytvorPobocku(dodavatelId, pobocka);
            return new ResponseEntity<>(pobockaBean, HttpStatus.OK);
        
    }
    
    @RequestMapping(value = "/pobocky/seznamDleDodavatele", method = RequestMethod.GET)
    public ResponseEntity<List<PobockaBean>> vypisSeznamPobocekDodavatele(@RequestParam("dodavatelId") Long dodavatelId)
    {
        return new ResponseEntity<>(pobockaService.vypisSeznamPobocekDodavatele(dodavatelId), HttpStatus.OK);
    }
}
