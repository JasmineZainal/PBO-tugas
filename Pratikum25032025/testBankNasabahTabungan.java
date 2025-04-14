/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum25032025;

import Pratikum25032025.nasabah;

/**
 *
 * @author Jasminee
 */
public class testBankNasabahTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Membuat objek Nasabah 1
        nasabah nasabah1 = new nasabah("Jasmine", "Melati");
        tabungan tabungan1 = new tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        // Membuat objek Nasabah 2
        nasabah nasabah2 = new nasabah("Melati", "Jasmine");
        tabungan tabungan2 = new tabungan(8000);
        nasabah2.setTabungan(tabungan2);

        // Menampilkan informasi awal
        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung nasabah");
        // Objek 1 menabung 4000
        tabungan1.simpanUang(4000);
        System.out.println("Setelah Jasmine menabung 4000: " + tabungan1.getSaldo());

        // Objek 2 menabung 7000
        tabungan2.simpanUang(7000);
        System.out.println("Setelah Melati menabung 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");
        // Objek 1 mengambil uang 5000
        tabungan1.ambilUang(5000);
        System.out.println("Setelah Jasmine mengambil 5000: " + tabungan1.getSaldo());

        // Objek 2 mengambil uang 6000
        tabungan2.ambilUang(6000);
        System.out.println("Setelah Melati mengambil 6000: " + tabungan2.getSaldo());

        // Objek 2 transfer ke objek 1 sebesar 1000
        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah Jasmine transfer 1000 ke Melati:");
        System.out.println("Saldo Jasmine : " + tabungan1.getSaldo());
        System.out.println("Saldo Melati: " + tabungan2.getSaldo());
     
    }
    
}
