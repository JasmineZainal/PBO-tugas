/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum110325;

/**
 *
 * @author Jasminee
 */
public class AksiMobil {
    
public static void main(String[] args) {
        //buat objek baru
        Mobil mobilku = new Mobil();
        mobilku.merk = "Toyota";
        mobilku.plat = "BH 3322 DC";
        mobilku.tahun = 2004;
        mobilku.warna = "Hitam";
        
        System.out.println("----------------------");
        System.out.println("Data Mobil 1 ");
        System.out.println("Merk mobil = " + mobilku.merk);
        System.out.println("Plat mobil = " + mobilku.plat);
        System.out.println("Tahun mobil = " + mobilku.tahun);
        System.out.println("Warna mobil = " + mobilku.warna);
        //pemanggilan method
        mobilku.MobilAktif();//tanpa return
        System.out.println(mobilku.SuaraMobil());//dengan return
        
        System.out.println();
        
        Mobil mobilku2 = new Mobil();
        mobilku2.merk = "McLaren";
        mobilku2.plat = "Bh 6677 DI";
        mobilku2.tahun = 1997;
        mobilku2.warna = "Jingga";
                
        System.out.println("Data mobil 2");
        System.out.println("Merk mobil = " + mobilku2.merk);
        System.out.println("Plat mobil = " + mobilku2.plat);
        System.out.println("Tahun mobil = " + mobilku2.tahun);
        System.out.println("Warna mobil = " + mobilku2.warna);
        //pemanggilan method
        mobilku2.MobilAktif(); //tanpa return
        System.out.println(mobilku2.SuaraMobil());//dengan return
    }
}
