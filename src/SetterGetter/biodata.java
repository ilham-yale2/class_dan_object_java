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
public class biodata {
    // attribut (private)
    private String nama;
    private double kelas;
    private String jurusan;
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(double kelas){
        this.kelas = kelas;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    
    //getter
    public String getNama(){
        return nama;
    }
    public double getKelas(){
        return kelas;
    }
    public String getjurusan(){
        return jurusan;
    }
    
    
   
}
