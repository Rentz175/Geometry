/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.bidang;

/**
 *
 * @author Febrian
 */
public class Lingkaran implements MenghitungBidang{

    public double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double getJariJari() {
        return jarijari;
    }

    public void setJariJari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    @Override
    public double luas() {
        return Math.PI*jarijari*jarijari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jarijari;
    }
    
}
