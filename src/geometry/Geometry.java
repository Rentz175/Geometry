/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometry;

import geometry.bidang.Lingkaran;
import geometry.ruang.bola.Bola;
import geometry.ruang.bola.Juring;
import geometry.ruang.bola.Keratan;
import geometry.ruang.bola.Tembereng;
import geometry.ruang.kerucut.KerucutTerpancung;
import geometry.ruang.tabung.Tabung;
import java.util.Scanner;

/**
 *
 * @author Febrian
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu;
        char ulang;
        int panjang, lebar, tinggi, jarijari;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Geomrty ");
        System.out.println("Lingkaran");
        
        System.out.print("Masukan Jari-Jari : ");            
        
        jarijari = input.nextInt();
        Lingkaran li = new Lingkaran(jarijari);
        
        System.out.println("Luas Lingkaran = " + li.luas());
        System.out.println("Keliling Lingkaran = " + li.keliling());
        
        
        
        do {
            System.out.println("Menu");
            System.out.println("1. Tabung");
            System.out.println("2. Kerucut");
            System.out.println("3. Bola");
            System.out.println("0. Exit");
            System.out.println("Pilih Menu : ");

            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukan Tinggi : ");
                    tinggi = input.nextInt();
                    Tabung tb = new Tabung(tinggi, jarijari);
                    
                    System.out.println("Volume Tabnung = " + tb.volume());
                    System.out.println("Luas Tabung = " + tb.luaspermukaan());
                    break;
                case 2:
                    
                    System.out.print("Masukan Tinggi Kerucut    : ");
                    tinggi = input.nextInt();
                    System.out.print("Masukan Jari-Jari tutup   : ");
                    double jarijaritutup = input.nextInt();
                    System.out.print("Masukan Tinggi tutup      : ");
                    double tinggitutup = input.nextInt();
                    
                    KerucutTerpancung kT = new KerucutTerpancung(jarijaritutup,tinggitutup, tinggi ,li.jarijari);
                    
                    System.out.println("Volume Kerucut = " + kT.volume());
                    System.out.println("Luas Keucut = " + kT.luaspermukaan());
                    System.out.println("Volume Kerucut Terpancung = " + kT.volumeterpancung() );
                    System.out.println("Luas Kerucut Terpancung = " + kT.luaspermukaanterpancung());
                    
                    break;
                case 3:
                    System.out.println("Masukan Tinggi : ");
                    tinggi = input.nextInt();
//                    Bola bl = new Bola(jarijari);
                    Juring jr = new Juring(li.jarijari, tinggi);
                    Keratan kr = new Keratan(li.jarijari, tinggi);
                    Tembereng tm = new Tembereng(li.jarijari, tinggi);
                    
                    System.out.println("Volume Bola = " + jr.volume());
                    System.out.println("Luas Bola = " + jr.luaspermukaan());
                    
                    System.out.println("Volume Juring = " + jr.volumejuring());
                    
                    System.out.println("Luas Keratan = " + kr.luaspermukaanKeratan());
                    
                    System.out.println("Volume Temberng = " + tm.volumeTemberng());
                    System.out.println("Luas Temberng = " + tm.luaspermukaanTemberng());
                    
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Tidak Valid");
            }
            System.out.println("Kembali ? (y/n)");
            ulang = input.next().charAt(0);
        } while (ulang != 'n');
        
        
        
    }
    
}
