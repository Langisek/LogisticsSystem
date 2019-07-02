/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "PRODUKTY")
public class Produkty implements Serializable {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Column (name = "Nazev", nullable = false)
    private String nazev;
    
    @Column (name = "Popis", nullable = false)
    private String popis;
    
    @Column (name = "Cena", nullable = false)
    private int cena;
}
