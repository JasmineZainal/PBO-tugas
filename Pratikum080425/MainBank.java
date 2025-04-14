/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum080425;

import java.util.Scanner;

/**
 *
 * @author Jasminee
 */
public class MainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        char ulang;

        // Nasabah yang sudah ada dari awal
        bank.tambahNasabah("lila", "Naning", new Tabungan(0));
        bank.tambahNasabah("Eli", "Rini", new Tabungan(1000));

        do {
            System.out.println("===== Program Nasabah Bank =====");
            System.out.println("1. Menambah Nasabah");
            System.out.println("2. Menampilkan Nasabah dan jumlahnya");
            System.out.println("3. Deposito");
            System.out.println("4. Ambil Uang");
            System.out.println("5. Transfer");
            System.out.println("6. Mencari Nasabah (nama awal)");
            System.out.println("7. Mencari Indeks Nasabah");
            System.out.println("8. Exit");
            System.out.print("Program yang ingin dipilih: ");
            int program = scanner.nextInt();
            scanner.nextLine();


            switch (program) {
                case 1: {
                    System.out.print("\nMasukkan nama awal nasabah: ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah: ");
                    String namaAkhir = scanner.nextLine();
                    System.out.print("Masukkan saldo awal tabungan: ");
                    int saldoAwal = scanner.nextInt();
                    bank.tambahNasabah(namaAwal, namaAkhir, new Tabungan(saldoAwal));
                    break;
                }
                case 2: {
                    System.out.println("\nDaftar Nasabah:");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println("Nama: " + bank.getNasabah(i).toString());
                        System.out.println("Nomor Indeks: " + i);
                    }
                    System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());
                    break;
                }
                case 3: {
                    System.out.print("\nMasukkan indeks nasabah untuk menyimpan uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah >= 0 && indeksNasabah < bank.getJumlahNasabah()) {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.print("Masukkan jumlah uang yang akan disimpan: ");
                        int jumlahSimpan = scanner.nextInt();
                        Tabungan tabungan = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabungan != null) {
                            tabungan.simpanUang(jumlahSimpan);
                            System.out.println("Saldo setelah disimpan: " + tabungan.getSaldo());
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("\nMasukkan indeks nasabah untuk mengambil uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah >= 0 && indeksNasabah < bank.getJumlahNasabah()) {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.print("Masukkan jumlah uang yang akan diambil: ");
                        int jumlahAmbil = scanner.nextInt();
                        Tabungan tabungan = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabungan != null) {
                            boolean berhasil = tabungan.ambilUang(jumlahAmbil);
                            if (berhasil) {
                                System.out.println("Saldo setelah diambil: " + tabungan.getSaldo());
                            } else {
                                System.out.println("Saldo tidak mencukupi.");
                            }
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;
                }
                case 5: {
                    System.out.print("\nMasukkan indeks nasabah pengirim: ");
                    int indeksPengirim = scanner.nextInt();
                    System.out.print("Masukkan indeks nasabah penerima: ");
                    int indeksPenerima = scanner.nextInt();

                    if (indeksPengirim >= 0 && indeksPengirim < bank.getJumlahNasabah()
                            && indeksPenerima >= 0 && indeksPenerima < bank.getJumlahNasabah()) {

                        Tabungan tabunganPengirim = bank.getNasabah(indeksPengirim).getTabungan();
                        Tabungan tabunganPenerima = bank.getNasabah(indeksPenerima).getTabungan();

                        if (tabunganPengirim != null && tabunganPenerima != null) {
                            System.out.print("Masukkan jumlah uang yang akan ditransfer: ");
                            int jumlahTransfer = scanner.nextInt();
                            if (tabunganPengirim.transfer(tabunganPenerima, jumlahTransfer)) {
                                System.out.println("Transfer berhasil!");
                            } else {
                                System.out.println("Transfer gagal! Saldo tidak cukup.");
                            }
                        } else {
                            System.out.println("Salah satu nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Salah satu nasabah tidak ditemukan.");
                    }
                    break;
                }
                case 6: {
                    System.out.print("\nMasukkan nama awal nasabah yang dicari: ");
                    String namaAwal = scanner.nextLine();
                    int[] hasil = bank.searchNasabah(namaAwal);
                    if (hasil.length > 0) {
                        System.out.println("Nasabah yang ditemukan:");
                        for (int indeks : hasil) {
                            System.out.println(bank.getNasabah(indeks).toString());
                            System.out.println("Nomor Indeks: " + indeks);
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;
                }
                case 7: {
                    System.out.print("\nMasukkan nama awal nasabah: ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah: ");
                    String namaAkhir = scanner.nextLine();
                    int hasil = bank.searchNasabah(namaAwal, namaAkhir);
                    if (hasil >= 0) {
                        System.out.println("Indeks nasabah: " + hasil);
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    return;
                }
                default: {
                    System.out.println("Pilihan tidak valid.");
                }
            }

            System.out.print("\nApakah ingin mengulang program? (y/n): ");
            ulang = scanner.next().charAt(0);
            scanner.nextLine(); // clear buffer
            System.out.println("\n");

        } while (ulang == 'y' || ulang == 'Y');
    }
    

