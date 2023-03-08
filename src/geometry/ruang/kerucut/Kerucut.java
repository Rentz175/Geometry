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
    private double tinggi;
    
    public Kerucut(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
        
    }
    
    @Override
    public double volume() {
        return ((double)1/3)*super.luas()*tinggi;
    }

    @Override
    public double luaspermukaan() {
        
        double sisi = Math.sqrt((jarijari*jarijari)+(tinggi*tinggi));
        return Math.PI*jarijari*sisi + super.luas();
    }
}
