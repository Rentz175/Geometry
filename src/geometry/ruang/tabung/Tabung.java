/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.tabung;

import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author Febrian
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return 2*super.luas()+(super.keliling()*tinggi);
    }

    @Override
    public double luaspermukaan() {
       return super.luas()*tinggi;
    }
    
    
}
