/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Lenovo
 */
public class kuda {
    int jumlahTelinga = 0;
    String warnaBulu ="";
    
    public kuda(String warna,int jumlah){
    
        
        this.warnaBulu = warna;
        this.jumlahTelinga = jumlah;
    
    }
    
    public void info(){
    
        System.out.println("kuda berbulu "+this.warnaBulu+", mempunyai "+this.jumlahTelinga+" telinga.");
    
    }
}
