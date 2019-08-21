package com.langi.logisticssystem.dto;

import com.langi.logisticssystem.entities.Dodavatel;

/**
 *
 * @author david.langer
 */
public class PobockaBean {
    
    private long id;
    
    private String ulice;
    
    private String cisloPopisne;
    
    private String mesto;
    
    private String postovniCislo;
    
    private String stat;
    
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
