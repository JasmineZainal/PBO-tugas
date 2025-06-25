/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee
 */
public class Taksi extends Kendaraan{
    // Atribut khusus Taksi
    private int tarifAwal;
    private int tarifperKM;

    // Setter untuk tarifAwal
    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    // Getter untuk tarifAwal
    public int getTarifAwal() {
        return this.tarifAwal;
    }

    // Setter untuk tarifperKM
    public void setTarifPerKm(int tarifperKM) {
        this.tarifperKM = tarifperKM;
    }

    // Getter untuk tarifperKM
    public int getTarifPerKm() {
        return this.tarifperKM;
    }


}
