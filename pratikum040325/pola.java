/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum040325;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class pola {
     public static void main(String[] args) {
        int n, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ukuran n: ");
        n = in.nextInt();
        
        System.out.println("1.");
        for(i = 0; i < n; i++){
            for(j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        } 
        System.out.println();
        
        System.out.println("2.");
        for(i = n; i > 0; i--){
            for(j = i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        } 
        System.out.println();
        
        int a = 0;
        System.out.println("3.");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                a++;
                System.out.print(a + "\t");
            }
            System.out.println();
        } 
        System.out.println();
        
        System.out.println("4.");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(a + "\t");
                a--;
            }
            System.out.println();
        } 
        System.out.println();
    }
}

