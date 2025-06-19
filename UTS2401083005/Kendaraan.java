/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee kode B
 */
public class Kendaraan {
    int JmlRoda;
    String warna;
    
    public Kendaraan(){
     
     
    }
    public void setJmlRoda(int JmlRoda){
        this.JmlRoda= 0;
    
    }
    public int getJmlRoda(){
        return JmlRoda;
    }
    public void setWarna (String Warna){
        this.warna=warna;
    }
    public String getWarna(){
        return warna;
    }

    public void cetak() {
        System.out.println("Jumlah Roda : " + JmlRoda);
        System.out.println("Warna       : " + warna);
    }
}
