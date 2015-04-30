/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week2.models;

import blok.d.week2.Practicum1.Size;

/**
 *
 * @author Jeffrey
 */
public class Clothes extends Product {
    
    private final Size size;
    
    public Clothes(int id, double price, String description, Size size) {
        super(id, price, description);
        
        this.size = size;
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() * 1.10;
    }
    
    public Size getSize() {
        return this.size;
    }
    
}
