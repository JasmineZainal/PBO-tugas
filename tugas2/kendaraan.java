/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Jasminee
 */
public class kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    public kendaraan(String j, String m, int t, String w){
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    public void Infokendaraan(){
        
        System.out.println("-----");
        System.out.println("Data Kendaraan Anda");
        System.out.println("-----");
        System.out.println("jenis kendaraam = "+jenis);
        System.out.println("merk kendaraam = "+merk);
        System.out.println("tahun kendaraam = "+tahun);
        System.out.println("warna kendaraam = "+warna);
    }
    public void CekHarga(int harga){
        System.out.println("harga sewa kendaraan : rp "+harga);
    }
        
    public void Kecepatan(int kec){
        if(kec>=20 && kec<=40){
            System.out.print("slow car");
        }
        else if(kec>=41 && kec<=60){
            System.out.print("medium car");
        }
        else if(kec>=61 && kec<=85){
            System.out.print("fast car");
        }
        else {
            System.out.print("kendaraan anda tidak layak pakai");
        }
    }

}
