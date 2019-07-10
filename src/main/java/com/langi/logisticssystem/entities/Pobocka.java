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
@Table(name = "POBOCKA")
public class Pobocka implements Serializable {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Column (name = "Ulice", nullable = false)
    private String ulice;
    
    @Column (name = "CisloPopisne", nullable = false)
    private String cisloPopisne;
    
    @Column (name = "Mesto", nullable = false)
    private String mesto;
    
    @Column (name = "PostovniCislo", nullable = false)
    private String postovniCislo;
    
    @Column (name = "Stat", nullable = false)
    private String stat;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "dodavatel_na_pob_id", nullable = true)
    private Dodavatel dodavatelNaPobocce;
}
