/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.kerucut;

import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author Febrian
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private double tinggi, sisi;
    
    public Kerucut(double tinggi, double sisi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    @Override
    public double volume() {
        return 1/3*super.luas()*tinggi;
    }

    @Override
    public double luaspermukaan() {
        return Math.PI*jarijari*sisi + super.luas();
    }
    
}
