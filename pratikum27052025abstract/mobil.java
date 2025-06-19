/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025abstract;

/**
 *
 * @author Jasminee
 */
public abstract class mobil extends kendaraan{
         private int jumlahPintu;
         private String transmisi;
    
    public mobil (String merk, int tahun, int jumlahPintu, String transmisi) {
        super (merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getTransmisi (){
        return transmisi;
    }
    
    public void setTransmisi (String transmisi){
        this.transmisi = transmisi;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("Mobil " + Merk + " dinyalakan dengan");
    }
    
    @Override
    public void matikan() {
        System.out.println("Mobil " + Merk + " dimatikan ");
    }
    
    @Override
    public void info() {
        System.out.println("Informasi Mobil:       ");
        System.out.println("Merk         : " + Merk);
        System.out.println("Tahun        : " + tahun);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Transmisi    : " + transmisi);
    }
    
    @Override
    public void periksaKondisi() {
        System.out.println("Memeriksa oli,rem, dan tekanan ban mobil  " + Merk + ".");
    }

    @Override
    public void servis() {
        System.out.println("Melakukan servis untuk mobil " + Merk + "dijadwalkan servis setiap 10.00 km.");
    }
    


}
