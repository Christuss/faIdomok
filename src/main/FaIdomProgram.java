/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import model.FaIdom;
import model.Gomb;
import model.Hasab;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class FaIdomProgram {

    private ArrayList<FaIdom> idomok;

    public static void main(String[] args) {
        new FaIdomProgram().run();
    }

    public double osszSuly() {
        double ossz = 0;
        for (FaIdom faIdom : idomok) {
            ossz += faIdom.suly();
        }
        return ossz;
    }

    public double osszGombSuly() {
        double ossz = 0;
        for (FaIdom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                ossz += faIdom.suly();
            }
        }
        return ossz;
    }

    public FaIdom minV() {
        FaIdom min = idomok.get(0);
        for (FaIdom faIdom : idomok) {
            if (min.terfogat() > faIdom.terfogat()) {
                min = faIdom;
            }
        }

        return min;
    }

    public FaIdomProgram() {
        this.idomok = new ArrayList<>();
    }

    public FaIdom maxV() {
        FaIdom max = new Gomb(0);
        for (FaIdom faIdom : idomok) {
            if (faIdom.terfogat() > max.terfogat()) {
                max = faIdom;
            }
        }
        return max;
    }

    public void run() {
        idomok.add(new Gomb(4));
        idomok.add(new Gomb(2));
        idomok.add(new Hasab(1, 1, 1));
        idomok.add(new Hasab(2, 5, 3));

        System.out.println("Idomok:");
        for (FaIdom faIdom : idomok) {
            System.out.println(faIdom);
        }
        System.out.println("Legkisebb terfogat: " + minV() + "tipusa:" + minV().getClass().getSimpleName());
        System.out.println("Legnagyobb terfogat: " + maxV() + "tipusa:" + maxV().getClass());
        System.out.println("Osszes idom sulya: " + osszSuly());
        System.out.println("Osszes gomb sulya: " + osszGombSuly());
    }
}
