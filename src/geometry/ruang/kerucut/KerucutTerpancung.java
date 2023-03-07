/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.kerucut;

import geometry.ruang.MenghitungRuang;

/**
 *
 * @author Febrian
 */
public class KerucutTerpancung extends Kerucut implements MenghitungRuang {
    private double jarijaritutup, tinggitutup, sisitutup;

    public KerucutTerpancung(double jarijaritutup, double tinggitutup, double sisitutup, double tinggi, double sisi, double jarijari) {
        super(tinggi, sisi, jarijari);
        this.jarijaritutup = jarijaritutup;
        this.tinggitutup = tinggitutup;
        this.sisitutup = sisitutup;
    }
    
    @Override
    public double volume() {
        return super.volume() - 1/3*Math.PI*jarijaritutup*jarijaritutup*tinggitutup;
    }

    @Override
    public double luaspermukaan() {
        return super.luaspermukaan() - Math.PI*jarijaritutup*sisitutup;
    }

    
    
    
}
