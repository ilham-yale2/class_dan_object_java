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
public class Main {
    
    public static void main(String[] args){
        //overloading pada constructor
        Murid murid1 = new Murid("Ilhami Magfiro");
        Murid murid2 = new Murid();
        Murid murid3 = new Murid();
        Murid murid4 = new Murid();
    
        murid1.show();
        murid2.show();
        murid3.show();
        murid4.show();
        
        //overloading pada method
        
        int a = Kalkulator.tambah(1, 19);
        System.out.println( "Hasil : " + a);
        
        double b = Kalkulator.tambah(2.9, 0.4);
        System.out.println( "Hasil : " + b);
        
    }
}
