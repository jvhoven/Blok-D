/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week2.models;

import java.util.Date;

/**
 *
 * @author Jeffrey
 */
public class Food extends Product {
    
    private final Date expirationDate;
    
    public Food(int id, double price, String description, Date expirationDate) {
        super(id, price, description);
        
        this.expirationDate = expirationDate;
    }
    
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
}
