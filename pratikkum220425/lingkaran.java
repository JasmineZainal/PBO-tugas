/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikkum220425;

/**
 *
 * @author Jasminee
 */
public class lingkaran{
    private double jari_jari;
    
    public lingkaran(double jarijari){
        this.jari_jari=jarijari;
    }
    
    public void setJarijari(double Jarijari){
        this.jari_jari=Jarijari;
    }
    
    public double getJarijari(){
        return jari_jari;
    }
    
    public double getDiameter(){
        return 2*jari_jari;
    }
    
    public double getKeliling(){
        return 2*Math.PI*jari_jari*jari_jari;
    }
    
    public double getLuas(){
        return Math.PI*jari_jari*jari_jari;
    }
   @Override
   public String toString(){
       return ("Lingkaran dengan r" + jari_jari +", diameter" + getDiameter() +", luas" + getLuas() +", dan keliling" + getKeliling());
   }
}

       


            
