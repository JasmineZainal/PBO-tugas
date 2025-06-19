/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum270525int;

/**
 *
 * @author Jasminee
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
        private boolean dayaTersambung;
    
    public Keyboard (String nama,String jenis, boolean dayaTersambung) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println("Keyboard"+ nama+ "dimainkan dengan menekan tuts,");
    }
    @Override
    public void stem() {
        System.out.println("Mengecek dan menyesuaikan suara keyboard " + nama + ".");
    }

    @Override
    public void nyalakan() {
         if (dayaTersambung) {
            System.out.println(nama + " dinyalakan.");
        }else {
            System.out.println("Tidak bisa menyalakan Keyboard. Daya belum tersambung.");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
}
