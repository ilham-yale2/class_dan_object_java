/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Lenovo
 */
public class Murid {
    private String nama ;
    private static int jumlahMurid;
    
    //overloading constructor
    Murid(String nama){
        Murid.jumlahMurid++;
        this.nama = nama;
    }
    
    Murid(){
        this.nama = "siswa"+ Murid.jumlahMurid++;;
    }
    
    void show(){
        System.out.println("Nama :" + this.nama);
    }
}
