/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lenovo
 */

public class Siswa1 extends Siswa{
    String nama = "ilham";
    String kelas = "XII";
    String jurusan = "RPL";
    
    void print(){
//        this : menampilkan attribut pada kelas ini 
//        super : menampilkan attribut pada kelas induk
        System.out.println("nama    : "+ this.nama);
        System.out.println("kelas   : "+ this.kelas);
        System.out.println("jurusan : "+ this.jurusan);
    }
}
