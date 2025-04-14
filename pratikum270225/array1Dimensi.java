package pratikum270225;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jasminee
 */
public class array1Dimensi {
     public static void main(String[] args) {
        int A[], n, i;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak data: ");
        n = in.nextInt();
        A = new int[n]; //memasukkan ukuran array
        //mengisi array
        
        for(i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = in.nextInt();
        }
        
        int jumlah = 0;
        //hitung jumlah dan rata-rata
        for(i = 0; i < n; i++) {
            jumlah += A[i];
        }
        
        float rata = (float) jumlah / n;
        
        //tampilkan isi array dan hasil perhitungan
        for(i = 0; i < n; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        System.out.println("Jumlah array = " + jumlah);
        System.out.println("Rata-rata array = " + rata);
        
        //Mencari nilai terbesar dan terkecil versi 1
        
        int max = A[0];
        int min = A[0];
        
        for(i = 1; i < n; i++) {
            if(A[i] > max) {
                max = A[i];
            }else if (A[i] < min) {
                min = A[i];
            }
        }
        
        System.out.println("Nilai terbesar adalah " + max);
        System.out.println("Nilai terkecil adalah " + min);
        
        //mencari nilai terbesar dan terkecil versi 2
        
        int imax = 0;
        int imin = 0;
        
        for(i = 1; i < n; i++) {
            if(A[i] > A[imax]) {
                imax = i;
            }else if (A[i] < A[imin]) {
                imin = i;
            }
        }
        
        System.out.println("Nilai terbesar adalah " + A[imax]);
        System.out.println("Nilai terkecil adalah " + A[imin]);
    }
}
