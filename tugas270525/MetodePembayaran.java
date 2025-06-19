/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas270525;

/**
 *
 * @author Jasminee
 */
public abstract class MetodePembayaran implements Pembayaran {
    protected String jenis;

    public MetodePembayaran(String jenis) {
        this.jenis = jenis;
    }

    public abstract void proses();
}
