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
public class InputVariabel {
    public static void main(String[] args) {
        String nama;
        int umur;
        char jk;
        float rapor;
        boolean asal;
        Scanner input = new Scanner(System.in);
        System.out.println("==Program Input Variabel==");
        System.out.println("Nama anda = ");
        nama = input.nextLine(); //baca string
        System.out.println("Umur anda = ");
        umur = input.nextInt(); //baca int
        System.out.println("Gender (P/L) = ");
        jk = input.next().charAt(0); //baca char
        System.out.println("Rata-rata rapor = ");
        rapor = input.nextFloat(); //baca float
        System.out.println("Asal Padang (true/false) = ");
        asal = input.nextBoolean(); //baca boolean
        System.out.println("\n==Input Data Anda==");
        System.out.println("Nama Anda = " + nama);
        System.out.println("Umur Anda = " + umur + " tahun");
        System.out.println("Gender (P/L) = " + jk);
        System.out.println("Rata-rata rapor = " + rapor);
        System.out.println("Asal Padang (true/false) = " + asal);
        if(asal) //asal = true
            System.out.println("Anda berasal dari Padang");
        else //asal = false
            System.out.println("Anda bukan dari Padang");
        //endif
    }
}
