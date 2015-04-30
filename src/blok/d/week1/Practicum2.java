/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week1;

import blok.d.week1.model.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author Jeffrey
 */
public class Practicum2 {
    
    public static final double EUR_LITRE = 1.739; 
    
    public Practicum2() {
        
        // P86();
        P822();
        
    }
    
    public void P86() {
        Car fiat = new Car(12);
        fiat.setGasPrice(EUR_LITRE);
        
        fiat.tank(56);
        fiat.drive(200);
        
        System.out.println("Litres left: " + fiat.getFuel());
        System.out.println("Value of tank: € " + BigDecimal.valueOf(fiat.getValueTank()).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
    
    public void P822() {
        
        Mailbox mailBox = new Mailbox();
        
        // String recipient, String sender, String message
        Mail mail = new Mail("Henk de Vries", "Jeffrey van Hoven", "Hey you there!");
        mailBox.addMail(mail);
        
        System.out.println(mailBox.getMail(0));
    }
    
}
