/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "DODAVKY")
public class Dodavky implements Serializable{
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Temporal(TemporalType.DATE)
    private Date datumOdeslano;
    
    @Temporal(TemporalType.TIME)
    private Date casOdeslano;
    
    @Temporal(TemporalType.DATE)
    private Date datumPrijato;
    
    @Temporal(TemporalType.TIME)
    private Date casPrijato;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatumOdeslano() {
        return datumOdeslano;
    }

    public void setDatumOdeslano(Date datumOdeslano) {
        this.datumOdeslano = datumOdeslano;
    }

    public Date getCasOdeslano() {
        return casOdeslano;
    }

    public void setCasOdeslano(Date casOdeslano) {
        this.casOdeslano = casOdeslano;
    }

    public Date getDatumPrijato() {
        return datumPrijato;
    }

    public void setDatumPrijato(Date datumPrijato) {
        this.datumPrijato = datumPrijato;
    }

    public Date getCasPrijato() {
        return casPrijato;
    }

    public void setCasPrijato(Date casPrijato) {
        this.casPrijato = casPrijato;
    }
    
}
