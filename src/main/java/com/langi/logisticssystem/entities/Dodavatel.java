/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author david.langer
 */
@Entity
@Table(name = "DODAVATEL")
public class Dodavatel implements Serializable {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    @Column (name = "Nazev", nullable = false)
    private String nazev;
    
    @Column (name = "Telefon", nullable = true)
    private String telefon;
    
    @Column (name = "Email", nullable = true)
    private String email;
    
    @OneToMany(mappedBy = "dodavatelNaAdrese")
    private List<Adresa> adresy;

    
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

    public List<Adresa> getAdresy() {
        return adresy;
    }

    public void setAdresy(List<Adresa> adresy) {
        this.adresy = adresy;
    }
    
    
}
