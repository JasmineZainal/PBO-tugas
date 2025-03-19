/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class permutasi {
     public static void main(String[] args) {
        int n, r;
        //n: banyak unsur
        //r: banyak unsur yang dipermutasikan/dikombinasikan
        
        Scanner in = new Scanner(System.in); //membuat objek scanner
        
        System.out.println("=====Program Permutasi dan Kombinasi=====");
        System.out.println("n: Banyak unsur");
        System.out.println("r: banyak unsur yang dipermutasikan/dikombinasikan");
        
        //input user nilai n dan r
        System.out.print("Masukkan nilai n: ");
        n = in.nextInt();
        System.out.print("Masukkan nilai r:");
        r = in.nextInt();
        
        //proses fakorial dari n
        int i;
        
        int n2 = n; //n2 akan menampung hasil n yang telah  difaktorialkan
        for(i = n - 1; i > 0; i--) {
            n2 = n2 * i;
        }
        
        //proses faktorial dari r
        int r2 = r; //r2 akan menampung hasil r yang telah difaktorialkan
        for(i = r - 1; i > 0; i--) {
            r2 = r2 * i;
        }
        
        //proses faktorial dari (n - r)
        int nr = n - r; //nr akan menampung hasil (n - r)
        int nr2 = nr; //nr2 akan menampung hasil (n - r) yang telah difaktorialkan
        for(i = nr - 1; i > 0; i--) {
            nr2 = nr2 * i;
        }
        
        System.out.println("");
        
        //Permutasi
        System.out.println("Rumus permutasi: P(n, r) = n!/(n - r)!");
        System.out.print("P(" + n + ", " + r + ") = ");
        System.out.print(n + "!/(" + n + " - " + r + ")! = ");
        System.out.print(n + "!/" + nr + "! = ");
        System.out.println(n2 + "/" + nr2);
        System.out.println("= " + n2/nr2);
        System.out.println("Maka, hasil permutasi adalah " + n2/nr2);
        
        System.out.println("");
       
        //Kombinasi
        System.out.println("Rumus kombinasi: C(n, r) = n!/r!(n - r)!");
        System.out.print("C(" + n + ", " + r + ") = ");
        System.out.print(n + "!/" + r + "!(" + n + " - " + r + ")! = ");
        System.out.print(n + "!/" + r + "!(" + nr + ")! = ");
        System.out.print(n2 + "/(" + r2 + "x" + nr2 + ") = ");
        System.out.println(n2 + "/" + r2*nr2);
        System.out.println("= " + n2/(r2*nr2));
        System.out.println("Maka, hasil kombinasi adalah " + n2/(r2*nr2));
    }
}
