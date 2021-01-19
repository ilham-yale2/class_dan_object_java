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
public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    int sisi;
    
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }
    @Override
    public float keliling(){
        return this.sisi*3;
    }
}
