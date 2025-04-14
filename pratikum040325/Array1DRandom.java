/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum040325;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class Array1DRandom {
     public static void main(String[] args) {
        // TODO code application logic here
        int A[], n, i, banyak = 0, jumlah = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data: ");
        n = in.nextInt();
        A = new int[n]; //array A ukuran n
        System.out.println("===Data Anda===");
        System.out.print("Array: ");
        for(i = 0; i < n; i++) {
            A[i] = rand.nextInt(70-20) + 20 + 1;
            System.out.print(A[i] + "\t");
        }
        System.out.println();
        System.out.print("Array: ");
        for(i = 0; i < n; i++) {
            if(A[i] % 2 == 0){
                System.out.print(A[i] + "\t");
                banyak+= 1; //banyak indeks array genap
                jumlah = jumlah + A[i]; //penjumalahan array genap
            }
        }
        System.out.println();
        System.out.println("Jumlah array genap: " + banyak);
        System.out.println("hasil penjumlahan array genap: " + jumlah);
    }
}

