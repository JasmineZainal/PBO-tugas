/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum270525int;

/**
 *
 * @author Jasminee
 */
public class MainMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gitar gitar = new Gitar ("Gitar Klasik", "Petik" , 6);
        
        
        System.out.println("--- Info Gitar ---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
    }
    
}
