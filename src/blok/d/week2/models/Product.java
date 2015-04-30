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
public class Product {
    
    private final int id;
    private final double price;
    private final String description;
    
    public Product(int id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }
    
    // Ugly with reflection, yay for reflection!
    public void getShipmentTime() {
        // Get class name
        Object classType = this.getClass();
        
        if(classType.equals(Clothes.class)) {
            System.out.println("Shipment time is three days.");
        } else if(classType.equals(Food.class)) {
            System.out.println("Shipment time is a day.");
        } else if(classType.equals(Alcohol.class)) {
            System.out.println("Shipment is two days.");
        }
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\nType: " + this.getClass() + "\nPrice: " + price + "\nDescription: " + description;
    }
}
