/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.bola;

import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author Febrian
 */
public class Bola extends Lingkaran implements MenghitungRuang{

    public Bola(double jarijari) {
        super(jarijari);
    }

    @Override
    public double volume() {
        return 4/3*super.luas()*jarijari;
    }

    @Override
    public double luaspermukaan() {
        return 4*super.luas();
    }
    
}
