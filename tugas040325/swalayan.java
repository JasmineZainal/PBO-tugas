/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas040325;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class swalayan {
    public static void main(String[] args) {
        int menu, x, y, z;
        long totalHarga, totalHargaX = 0, totalHargaY = 0, totalHargaZ = 0;
        int ulangMenu;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("======Program Swalayan======");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|    MEREK   |    HARGA    |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|   1. X     | Rp. 40.000,-|");
        System.out.println("|   2. Y     | Rp. 50.000,-|");
        System.out.println("|   3. Z     | Rp. 60.000.-|");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        do {
            System.out.println("Pilih merek yang ingin dibeli: ");
            menu = in.nextInt();
            
            switch(menu) {
            case 1:{
                System.out.print("Berapa? ");
                x = in.nextInt();
                totalHargaX += x * 40000; //+= digunakan untuk mengatasi jika user ingin menambah pembelian merek yang sama
            }break;
            case 2:{
                System.out.print("Berapa? ");
                y = in.nextInt();
                totalHargaY += y * 50000;
            }break;
            case 3:{
                System.out.print("Berapa? ");
                z = in.nextInt();
                totalHargaZ += z * 40000;
            }break;
            default:{
                System.out.print("Tidak merek di menu.");
            }
            }
            System.out.print("\nApakah ada tambahan yang lain");
            ulangMenu = in.nextInt();
        }while(ulangMenu == 1);
        
        totalHarga = totalHargaX + totalHargaY + totalHargaZ;
        System.out.println("Total Harga: Rp. " + totalHarga + ",-");
        
        in.close();
    }
}
    
    
