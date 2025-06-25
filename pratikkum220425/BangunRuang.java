/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikkum220425;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulang;
        
        do {
            System.out.println("=====Program Bangun 3 dimensi=====");
            System.out.println("1. Kerucut");
            System.out.println("2. Silinder");
            System.out.println("Pilih bangunan: ");
            int pilih = in.nextInt();
            
            System.out.println("Masukkan nilai jari-jari: ");
            double r = in.nextDouble();
            System.out.println("Masukkan nilai tinggi: ");
            double t = in.nextDouble();
            
            lingkaran lingkaran = new lingkaran(r);
            
            switch(pilih) {
                case 1:{
                    kerucut kerucut = new kerucut(r, t);

                    System.out.println("Lingkaran: \n" + lingkaran.toString());
                    System.out.println();
                    System.out.println("Kerucut: \n" + kerucut.toString());
                }break;
                case 2:{
                    silinder silinder = new silinder(r, t);

                    System.out.println("Lingkaran: \n" + lingkaran.toString());
                    System.out.println();
                    System.out.println("Silinder: \n" + silinder.toString());
                }break;
            }
            
            System.out.println("Apakah ingin mengulang program? (y/n): ");
            ulang = in.next().charAt(0);
        }while(ulang == 'y' || ulang == 'Y');
    }
        
    }
    

