/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025abstract;

/**
 *
 * @author Jasminee
 */
public class motor extends kendaraan{
        private String jenisHelm;
        private int cc;
    
    public motor (String merk, int tahun, String jenisHelm, int cc){
        super (merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    
    public String getJenisHelm(){
        return jenisHelm;
    }
    
    public void setJenisHelm (String jenisHelm){
        this.jenisHelm = jenisHelm;
    }
    
    public int getCC (){
        return cc;
    }
    
    public void setCC (int cc){
        this.cc = cc;
    }
    
    @Override
    public void nyalakan (){
        System.out.println("Motor" + Merk + " dimatikan.");
    }

    @Override
    public void info() {
        System.out.println("Motor" + Merk+ ", Tahun"+ 
                           tahun +","+ "cc: " + cc +", "
                           + "Helm :" + jenisHelm);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("periksa rantai, oli mesin, dan rem motor " + Merk + "...");
    }

    @Override
    public void servis() {
        System.out.println("servis untuk motor " + Merk + "perlu servis setiap 3000 km");
    }
 
}

