/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee
 */
public class TestKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJmlRoda(2);
        kendaraan.setWarna("Merah");
        System.out.println("Data Kendaraan:");
        kendaraan.cetak();
        System.out.println();

        // sepeda
        Sepeda sepeda = new Sepeda("1 Sadel", 5);
        System.out.println("Data Sepeda:");
        sepeda.cetak();
        System.out.println();

        // SepedaListrik
        SepedaListrik sepedaListrik = new SepedaListrik();
        sepedaListrik.setkecepatanMaks(25);
        sepedaListrik.setjaraktempuh(40);
        System.out.println("Data Sepeda Listrik:");
        sepedaListrik.cetak();
    }
}
