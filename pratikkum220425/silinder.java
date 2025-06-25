/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikkum220425;

/**
 *
 * @author Jasminee
 */
public class silinder {
    private double tinggi;
    private double jari_jari;
    
    public silinder(double r, double t){
        
    }
    
    public void setTinggi(double tinggi, double jari_jari){
        this.tinggi=tinggi;
        this.jari_jari=jari_jari;
    }
     
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        return Math.PI*jari_jari*jari_jari*tinggi;
    }    
    
    @Override
    public String toString(){
        return ("Silinder dengan Tinggi" + jari_jari+"jari_jari"+ tinggi+"tinggi"+tinggi+"tinggi"+"volume"+getVolume());
    }
    public double getLuas(){
        return 2*Math.PI*jari_jari*(jari_jari+tinggi);
    }
}