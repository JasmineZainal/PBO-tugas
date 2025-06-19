/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee KODE B
 */
public class SepedaListrik {
    int kecepatanMaks;
    int jaraktempuh;

    public SepedaListrik (){
        
    }
    public void setkecepatanMaks (int kecepatanMaks){
        this.kecepatanMaks=0;
    }
    
    public int getkecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setjaraktempuh (int jaraktempuh){
        this.jaraktempuh=jaraktempuh;
    }
    
    public int getjaraktempuh(){
        return jaraktempuh;
    }
    
    public void cetak() {
        System.out.println("kecepatanMaksimal : " + kecepatanMaks );
        System.out.println("Jarak Tempuh   : " + jaraktempuh);
    }
}
