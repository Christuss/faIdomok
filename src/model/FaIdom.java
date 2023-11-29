/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public abstract class FaIdom {
    private static final double fajsuly = 0.8;
    
    public abstract double terfogat();
    
    public double suly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" + '}';
    }
    
}
