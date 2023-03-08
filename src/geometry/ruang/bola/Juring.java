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
public class Juring extends Bola{
    private double tinggi;
    
    public Juring(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    public double volumejuring() {
        return ((double)2/3)*super.luas()*tinggi;
    }

//    @Override
//    public double luaspermukaan() {
//    
//    }
    
}
