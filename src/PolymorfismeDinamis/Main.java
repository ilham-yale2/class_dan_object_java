/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorfismeDinamis;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(10);
        Segitiga segitiga = new Segitiga(12,5);
        Lingkaran lingkaran = new Lingkaran(35);
        
        // memanggil method luas dan keliling
        
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}
