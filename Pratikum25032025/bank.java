/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum25032025;

import Pratikum25032025.nasabah;

/**
 *
 * @author Jasminee
 */
public class bank {
    private final nasabah [] nasabah;
    private int jumlahNasabah;
    
    public bank (){
        nasabah = new nasabah[100]; //maksimum 75 nasabah
        jumlahNasabah =0;
    }
    
     public void tambahNasabah (String namaAwal, String namaAkhir )
    {
  
        nasabah[jumlahNasabah++] = new nasabah(namaAwal, namaAkhir);
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir, tabungan tabungan){
        nasabah n = new nasabah(namaAwal, namaAkhir);
        n.setTabungan(tabungan);
        nasabah[jumlahNasabah++] = n;
    }
    
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }
    
    public nasabah getNasabah(int indeks){
        return (indeks >= 0 && indeks < jumlahNasabah)? nasabah[indeks]: null;
    }
    
    public int searchNasabah(String namaAwal, String namaAkhir){
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].toString().contains(namaAwal + " " + namaAkhir)) {
            return i;
            }
        }
        return-1;
    }
    
    public int[] searchNasabah(String namaAwal){
        int[] hasil = new int[jumlahNasabah];
        int count = 0;
        for (int i = 0; i < jumlahNasabah; i++) {
            if (nasabah[i].toString().contains(namaAwal)) {
                hasil[count++] = i;
            }
        }
        return java.util.Arrays.copyOf(hasil, count);
    }
}
