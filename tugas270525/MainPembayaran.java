/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas270525;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        MetodePembayaran bayar;

        System.out.println("=== PILIH METODE PEMBAYARAN ===");
        System.out.println("1. Transfer Bank");
        System.out.println("2. E-Wallet");
        System.out.println("3. Kartu Kredit");
        System.out.print("Pilihan (1-3): ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama bank: ");
                String bank = input.nextLine();
                bayar = new Transfer(bank);
                break;
            case 2:
                System.out.print("Masukkan nama aplikasi E-Wallet: ");
                String app = input.nextLine();
                bayar = new EWallet(app);
                break;
            case 3:
                System.out.print("Masukkan nomor kartu kredit: ");
                String kartu = input.nextLine();
                bayar = new KartuKredit(kartu);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        System.out.println("\n--- Detail Pembayaran ---");
        bayar.proses();

        input.close();

    }
    
}
