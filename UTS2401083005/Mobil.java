/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee
 */
public class Mobil extends Kendaraan{
   // Atribut tambahan khusus Mobil
    private String bahanBakar;
    private int kapasitasMesin;

    // Setter untuk bahanBakar
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    // Getter untuk bahanBakar
    public String getBahanBakar() {
        return this.bahanBakar;
    }

    // Setter untuk kapasitasMesin
    public void setkapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    // Getter untuk kapasitasMesin
    public int getkapasitasMesin() {
        return this.kapasitasMesin;
    }
 
    
}
