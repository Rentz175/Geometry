/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.bola;

import geometry.ruang.MenghitungRuang;

/**
 *
 * @author Febrian
 */
public class Keratan extends Bola implements MenghitungRuang {
    private double tinggi;
    
    public Keratan(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }

//    @Override
//    public double volume() {
//        
//    }

    @Override
    public double luaspermukaan() {
        return super.keliling()*tinggi;
    }
    
}
