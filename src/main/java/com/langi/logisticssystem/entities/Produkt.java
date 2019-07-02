/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "PRODUKTY")
public class Produkt implements Serializable {
    
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
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "dodavatel_produktu", nullable = true)
    private Dodavatel dodavatelProduktu;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "odeslany_produkt_id", referencedColumnName = "Id")
    private OdeslanyProdukt odeslanyProdukt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Dodavatel getDodavatelProduktu() {
        return dodavatelProduktu;
    }

    public void setDodavatelProduktu(Dodavatel dodavatelProduktu) {
        this.dodavatelProduktu = dodavatelProduktu;
    }
    
    
}
