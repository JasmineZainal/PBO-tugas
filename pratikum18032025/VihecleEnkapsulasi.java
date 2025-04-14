/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18032025;

/**
 *
 * @author Jasminee
 */
public class VihecleEnkapsulasi {
    private double load;
    private double maxLoad;
    
    public VihecleEnkapsulasi (double maxLoad){ //konsturuktor
        this.maxLoad = maxLoad;
    }

    VihecleEnkapsulasi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setMaxLoad (double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getmaxLoad (){
        return maxLoad;
    }
    public boolean addLoad (double weight ){
        if ((load+weight)<maxLoad){
            this.load = this.load+weight;
            return true;
        }else //load+weight>maxLoad
            return false;
        //endif
    }
}
