/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author david.langer
 */
public class OdeslanyProdukt {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @OneToOne(mappedBy = "odeslanyProdukt")
    private Produkt produkt;
    
    @Column (name = "Mnozstvi", nullable = false)
    private int mnozstvi;
    
    
}
