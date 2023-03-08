/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.kerucut;


/**
 *
 * @author Febrian
 */
public class KerucutTerpancung extends Kerucut {
    private double jarijaritutup, tinggitutup;

    public KerucutTerpancung(double jarijaritutup, double tinggitutup, double tinggi, double jarijari) {
        super(tinggi, jarijari);
        this.jarijaritutup = jarijaritutup;
        this.tinggitutup = tinggitutup;
    }
    
    
    public double volumeterpancung() {
        return super.volume() - 1/3*Math.PI*jarijaritutup*jarijaritutup*tinggitutup;
    }

   
    public double luaspermukaanterpancung() {
        double sisitutup = Math.sqrt((jarijaritutup*jarijaritutup)+(tinggitutup*tinggitutup));
        return super.luaspermukaan() - Math.PI*jarijaritutup*sisitutup;
    }

    
    
    
}
