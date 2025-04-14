/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum200225;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class TiketBus {
     public static void main(String[] args) {
        int menu, jum_tiket = 0;
        long harga = 0, tot_awal;
        float diskon = 0, tot_bayar = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|         KELAS      |    HARGA/TIKET    |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|   1. Ekonomi       |   Rp.350.000,00   |");
        System.out.println("|   2. Eksekutif     |   Rp.500.000,00   |");
        System.out.println("|   3. SuperEksekutif|   Rp.650.000,00   |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("Pilih tiket (angka)");
        menu = input.nextInt();
        System.out.println("Jumlah tiket");
        jum_tiket = input.nextInt();
        switch(menu) {
            case 1 -> {
                harga = 350000;
            }
            case 2 -> {
                harga = 500000;
            }
            case 3 -> {
                harga = 650000;
            }
            default -> {
                harga = 0;
                System.out.println("Kelas tidak tersedia");
            }
        }
        tot_awal = harga * jum_tiket;
        if (jum_tiket > 4) {
            System.out.println("Diskon!!!");
            diskon = (float) (0.1 * tot_awal);
        }else {
            diskon = 0;
        }
        tot_bayar = tot_awal - diskon;
        System.out.println("Biaya awal : " + tot_awal);
        System.out.println("Diskon     : " + diskon);
        System.out.println("Bayar      : " + tot_bayar);
    }
}
