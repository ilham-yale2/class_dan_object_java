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
public class Main {
    public static void main(String[] args){
        Siswa siswa = new Siswa();
        Siswa1 siswa1 = new Siswa1();
        
        
        System.out.println("   kelas induk   ");
        siswa.print();
        System.out.println("========================");
        System.out.println("   kelas turunan   ");
        siswa1.print();
    }
}
