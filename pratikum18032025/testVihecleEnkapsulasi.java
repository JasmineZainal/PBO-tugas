/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum18032025;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class testVihecleEnkapsulasi {
    public static void main(String[] args) {
      System.out.println("Kendaraan 1.Beban Maksimal 10.000kg");
      VihecleEnkapsulasi kendaraan1 = new  VihecleEnkapsulasi (10000);
     
      //menambahkan beban 
      System.out.println("Menambahkan beban 1 (500kg)"+ kendaraan1.addLoad(500));
      System.out.println("Menambahkan beban 1 (250kg)"+ kendaraan1.addLoad(250));
      System.out.println("Menambahkan beban 1 (5000kg)"+ kendaraan1.addLoad(5000));
      System.out.println("Menambahkan beban 1 (4000kg)"+ kendaraan1.addLoad(4000));
      System.out.println("Menambahkan beban 1 (350kg)"+ kendaraan1.addLoad(350));
      
       //menampilkan beban (load) kendaraan saat ini
       System.out.println("Beban kendaraan saat ini = "+ kendaraan1.getLoad()+ "kg");
       
       //membuat objek kendaraan2 menggunakan konstruktor kosong
       Scanner in = new Scanner (System.in);
       System.out.println("Kendaraan 2.Beban maksimal belum ada");
       VihecleEnkapsulasi kendaraan2 = new  VihecleEnkapsulasi ();
       //set maxLoad menggunakan method setMaxLoad
       System.out.println("Masukkan beban maksimal kendaraan");
       double bebanmax = in.nextDouble();
       kendaraan2.setMaxLoad(bebanmax);
       //isi beban pada kendaraan 
       System.out.print("masukkan berat beban yang akan diletakkan di kendaraan 2 ");
       double beban = in.nextDouble();
       while (kendaraan2.addLoad(beban)){
           System.out.println("Beban ditambahkan "+ beban +"kg");
           System.out.println("Masukkan berat beban yang akan diletakkan dikendaraan 2 ");
           beban = in.nextDouble();
       }
       if (!kendaraan2.addLoad(beban)){ //not true ==>false
           System.out.println("Beban kendaran saat ini ="+ kendaraan2.getLoad());
           System.out.println("Beban akan berlebih. Penambahan beban dibatalkan");
       }else
           System.out.println("Beban kendaran saat ini ="+ kendaraan2.getLoad());
       //endif
       
    }

}
