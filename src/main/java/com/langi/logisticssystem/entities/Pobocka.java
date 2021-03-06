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
    @JoinColumn(name = "dodavatel_pob_id", nullable = true)
    private Dodavatel dodavatelPobocky;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloPopisne() {
        return cisloPopisne;
    }

    public void setCisloPopisne(String cisloPopisne) {
        this.cisloPopisne = cisloPopisne;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPostovniCislo() {
        return postovniCislo;
    }

    public void setPostovniCislo(String postovniCislo) {
        this.postovniCislo = postovniCislo;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Dodavatel getDodavatelPobocky() {
        return dodavatelPobocky;
    }

    public void setDodavatelPobocky(Dodavatel dodavatelPobocky) {
        this.dodavatelPobocky = dodavatelPobocky;
    }
    
    
}
