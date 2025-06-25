/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikkum220425;

/**
 *
 * @author Jasminee
 */
public class kerucut {
    private double tinggi;
    private double jari_jari;
    private double s;
    
    public kerucut(){
        this.tinggi=0;
        this.jari_jari=0;
    }
    
    public kerucut(double tinggi, double jari_jari){
        this.tinggi=tinggi;
        this.jari_jari=jari_jari;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    
    public void setJarijari(double jari_jari){
        this.jari_jari=jari_jari;
    }
    
    public double getJarijari (){
        return jari_jari;
    }
    
    public double getVolume(){
        return 1/3 * Math.PI*Math.pow(jari_jari,2)*tinggi;
    }
    
    public double getLuas(){
        return s =  Math.sqrt(Math.pow(tinggi,2)+ Math.pow(jari_jari, 2));
    }
    
    public String toString(){
        return "kerucut dengan tinggi"+tinggi+"dan jari jari"+ jari_jari+
                "\nVolume : " +getVolume()+
                "\nLuas Permukaan : " +getLuas();
    }
}
