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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "ADRESA")
public class Adresa implements Serializable {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Column (name = "Ulice", nullable = true)
    private String ulice;
    
    @Column (name = "Nazev", nullable = true)
    private String cisloPopisne;
    
    @Column (name = "Nazev", nullable = true)
    private String mesto;
    
    @Column (name = "Nazev", nullable = true)
    private String postovniCislo;
    
    @Column (name = "Nazev", nullable = true)
    private String stat;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "dodavatel_na_adr_id", nullable = true)
    private Dodavatel dodavatelNaAdrese;
}
