/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week2.models;

/**
 *
 * @author Jeffrey
 */
public class Alcohol extends Product {
    
    private final int alcoholPercentage;
    
    public Alcohol(int id, double price, String description, int percentage) {
        super(id, price, description);
        
        this.alcoholPercentage = percentage;
    }
    
    public int getPercentage() {
        return this.alcoholPercentage;
    }
    
}
