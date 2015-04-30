/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week1.model;

/**
 *
 * @author Jeffrey
 */
public class Car {
    
    private int litres;
    private final int fuelEfficiency;
    private double gasPrice;
    
    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public void drive(int kilometres) {
        litres -= (kilometres / this.fuelEfficiency);
    }
    
    public int getFuel() {
        return this.litres;
    }
    
    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }
    
    public double getValueTank() {
        return gasPrice * getFuel();
    }
    
    public void tank(int litres) {
        this.litres += litres;
    }
}
