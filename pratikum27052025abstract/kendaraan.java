/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025abstract;

/**
 *
 * @author Jasminee
 */
public abstract class kendaraan {
        protected String Merk ;
        protected int tahun;
    
    public kendaraan (String Merk, int tahun){
        this.Merk = Merk;
        this.tahun = tahun;
    }
    
    public String getMerk(){
       return Merk;
    }
    
    public void setMerk (String merk){
        this.Merk = Merk;
    }
    
    public int getTahun (){
        return tahun;
    }
    public void setTahun (int tahun){
        this.tahun = tahun;
    }
    
    public void nyalakan(){
        System.out.println("Kendaraan dinyalakan.");
    }
    
    public void matikan (){
        System.out.println("Kendaraan dimatikan.");
    }
    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
}
