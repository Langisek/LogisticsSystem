/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "DODAVATEL")
public class Dodavatel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="dodavatel_generator")
    @SequenceGenerator(name="dodavatel_generator", sequenceName="DODAVATEL_SEKVENCE")
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Column (name = "Nazev")
    private String nazev;
    
    private String telefon;
    
    private String email;
    
    private String uliceSidla;
    
    private String cisloPopisneSidla;
    
    private String mestoSidla;
    
    private String postovniCisloSidla;
    
    private String statSidla;

    @OneToMany(mappedBy = "dodavatelPobocky")
    private List<Pobocka> pobocky;
    
    @OneToMany(mappedBy = "dodavatelDodavky")
    private List<Dodavka> dodavky;
    
    @OneToMany(mappedBy = "dodavatelProduktu")
    private List<Produkt> produkty;

    
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUliceSidla() {
        return uliceSidla;
    }

    public void setUliceSidla(String uliceSidla) {
        this.uliceSidla = uliceSidla;
    }

    public String getCisloPopisneSidla() {
        return cisloPopisneSidla;
    }

    public void setCisloPopisneSidla(String cisloPopisneSidla) {
        this.cisloPopisneSidla = cisloPopisneSidla;
    }

    public String getMestoSidla() {
        return mestoSidla;
    }

    public void setMestoSidla(String mestoSidla) {
        this.mestoSidla = mestoSidla;
    }

    public String getPostovniCisloSidla() {
        return postovniCisloSidla;
    }

    public void setPostovniCisloSidla(String postovniCisloSidla) {
        this.postovniCisloSidla = postovniCisloSidla;
    }

    public String getStatSidla() {
        return statSidla;
    }

    public void setStatSidla(String statSidla) {
        this.statSidla = statSidla;
    }

    public List<Pobocka> getPobocky() {
        return pobocky;
    }

    public void setPobocky(List<Pobocka> pobocky) {
        this.pobocky = pobocky;
    }

    public List<Dodavka> getDodavky() {
        return dodavky;
    }

    public void setDodavky(List<Dodavka> dodavky) {
        this.dodavky = dodavky;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }
    
    
}
