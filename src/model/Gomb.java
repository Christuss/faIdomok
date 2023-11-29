/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class Gomb extends FaIdom{
   
    private double sugar;

    public Gomb(double sugar) {
        super();
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3 ;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar +  '}';
    }
    
    
}
