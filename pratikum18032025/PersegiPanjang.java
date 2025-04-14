/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18032025;

/**
 *
 * @author Jasminee
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek =0;
    
    public PersegiPanjang(){
        
    }
    public PersegiPanjang (int pjbaru, int lbrbaru){
        panjang =pjbaru;
        lebar = lbrbaru;
    }
    public static int getjumlahObjek(){
        return jumlahObjek;
    }
    
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling (){
        return 2*(panjang + lebar);
    }
}
