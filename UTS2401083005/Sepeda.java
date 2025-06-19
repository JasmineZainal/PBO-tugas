/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2401083005;

/**
 *
 * @author Jasminee KODE B
 */
public class Sepeda {
    String jmlSadel;
    int jmlGir;

    public Sepeda(String jmlSadel, int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;
    }

    public void setjmlSadel (String jmlSadel){
        this.jmlSadel=jmlSadel;
    }

    public String getjmlSadel (){
        return jmlSadel;
    }

    public void setjmlGir(int jmlGir){
        this.jmlGir=jmlGir;
    }

    public int getjmlGir(){
        return jmlGir ;
    }
    
     public void cetak() {
        System.out.println("Jumlah Sadel : " + jmlSadel);
        System.out.println("Jumlah Gir   : " + jmlGir);
    }


}
