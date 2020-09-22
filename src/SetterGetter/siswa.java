/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetterGetter;

/**
 *
 * @author Lenovo
 */
public class siswa {
   public static void main(String[] args){
       // instance object from biodata class
       biodata data = new biodata();
       
       //write
       data.setNama("ilhami magfiro");
       data.setKelas(12);
       data.setJurusan("Rekayasa Perangkat Lunak");
       
       
      //read
       System.out.println("Nama : " + data.getNama() );
       System.out.println("Kelas : " + data.getKelas());
       System.out.println("Jurusan : " + data.getjurusan());
       
   } 
   
}
