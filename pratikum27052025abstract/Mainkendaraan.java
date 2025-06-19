/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum27052025abstract;

/**
 *
 * @author Jasminee
 */
public class Mainkendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mobil mobil = new mobil ("Toyota Avanza" , 2022, 4, "Automatic") {};
        motor motor = new motor ("Yamaha NMAX", 2024, "Full Face", 155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
      
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();

    }
    
}
