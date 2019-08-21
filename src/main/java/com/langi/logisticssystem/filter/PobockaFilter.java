package com.langi.logisticssystem.filter;

import java.util.List;

/**
 *
 * @author david.langer
 */
public class PobockaFilter extends BaseFilter{
    
    private String ulice;
    
    private String cisloPopisne;
    
    private String mesto;
    
    private String postovniCislo;
    
    private String stat;

    public PobockaFilter(String ulice, String cisloPopisne, String mesto, String postovniCislo, String stat, Integer start, Integer pocet, List<String> razeni) {
        super(start, pocet, razeni);
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.mesto = mesto;
        this.postovniCislo = postovniCislo;
        this.stat = stat;
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
}
