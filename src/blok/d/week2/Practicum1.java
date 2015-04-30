/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week2;

import blok.d.week2.models.*;
import java.util.Date;

/**
 *
 * @author Jeffrey
 */
public class Practicum1 {
    
    public enum Size {
        XL, L, M, S
    };
    
    public Practicum1() {
        
        //R914();
        Opdracht();
    }
    
    public void R914() {
        System.out.println("A, C");
    }
    
    public void Opdracht() {
        
        // The warehouse thatll store it all
        Warehouse warehouse = new Warehouse();
        
        // The products
        Clothes cloth = new Clothes(1, 80.20, "New jeans", Size.M);
        Alcohol beer = new Alcohol(2, 1.20, "Heineken beer", 8);
        Food cake = new Food(3, 10.22, "A delicious cake", new Date());
        
        // Add everything to the warehouse
        warehouse.save(cloth);
        warehouse.save(beer);
        warehouse.save(cake);
        
        // Retrieve everything from the warehouse
        warehouse.getStock();
        
        // Demo to show that you cant get non-existing products
        System.out.println(warehouse.get(4));
        
        // Demo to show casting to cloth
        Clothes fakeClothes = (Clothes)warehouse.get(3);
        System.out.println(fakeClothes.getSize());
    }
    
}
