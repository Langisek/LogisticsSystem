/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.langi.logisticssystem.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author david.langer
 */
public class OdeslaneProdukty {
    
    @Id
    @GeneratedValue
    @Column (name = "Id", nullable = false)
    private long id;
    
    
}
