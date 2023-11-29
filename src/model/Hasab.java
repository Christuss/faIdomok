/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class Hasab extends FaIdom{
    private double a,b, magassag;

    public Hasab(double a, double b, double magassag) {
        super();
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }
    
    

    @Override
    public double terfogat() {
        return a*b*magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
    }
    
    
}
