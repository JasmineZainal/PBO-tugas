/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas270525;

/**
 *
 * @author Jasminee
 */
public class KartuKredit extends MetodePembayaran {
    private String nomorKartu;

    public KartuKredit(String nomorKartu) {
        super("Kartu Kredit");
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void proses() {
        System.out.println("Metode: " + jenis);
        System.out.println("Pembayaran dengan Kartu Kredit: " + nomorKartu);
    }
}

