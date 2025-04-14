/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum18032025;

/**
 *
 * @author Jasminee
 */
public class testPersegiPanjang {
    public static void main(String[] args) {
        System.out.println("Banyak Objek saat ini ="+ PersegiPanjang.getjumlahObjek());
        //buat objek pertama
        PersegiPanjang PP1 = new PersegiPanjang ();
        PP1.panjang = 5;
        PP1.lebar =3;
        System.out.println("Banyak Objek setelah PP1 ="+ PersegiPanjang.getjumlahObjek());
        System.out.println("Luas = "+PP1.panjang+" * "+PP1.lebar+"PP1.getLuas()");
        
        //buat objek kedua
        PersegiPanjang PP2 = new PersegiPanjang (15,4);
        System.out.println("Banyak Objek setelah PP2 ="+ PersegiPanjang.getjumlahObjek());
        System.out.println("Keliling =2*  ("+PP2.panjang+" * "+PP2.lebar+")PP2.getkelilig()");
    }
    
}
