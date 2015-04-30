/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week2.models;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Jeffrey
 */
public class Warehouse {
    
    private HashMap<Integer, Product> stock = new HashMap<>();
    
    public void save(Product product) {
        stock.put(product.getId(), product);
    }
    
    public Product get(int id) {
        return stock.get(id);
    }
    
    public void getStock() {
        for(Entry<Integer, Product> set : stock.entrySet()) {
            System.out.println(set.getValue());
        }
    }
    
}
