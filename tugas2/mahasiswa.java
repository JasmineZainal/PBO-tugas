/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Jasminee
 */
public class mahasiswa {
    long nim;
    String nama;
    int uts;
    int uas;
    int tugas;
    int quiz;
    
    //constructor
    public mahasiswa(long nim,String nama,int uts,int uas, int tugas, int quiz)
    {
        this.nim=nim;
        this.nama=nama;
        this.uts=uts;
        this.uas=uas;
        this.tugas=tugas;
        this.quiz=quiz;
    }
    
    //method tanpa parameter
    public void tampildata(){
        System.out.println("----------------------------");
        System.out.println("DATA mahasiswa");
        System.out.println("----------------------------");
        System.out.println("NIM : " +nim);
        System.out.println("NAMA : " +nama);
        System.out.println("NILAI UTS : " +uts);
        System.out.println("NILAI UAS : " +uas);
        System.out.println("NILAI TUGAS : " +tugas);
        System.out.println("NILAI QUIZ : " +quiz);
    }
    
    public void konversi()
    {
       float nilaiakhir = (float) ((0.15 * quiz) + (0.25 * tugas) + (0.3 * uts) + (0.3 * uas));
       System.out.print("NILAI AKHIR : "+nilaiakhir);
       System.out.println();
        if(nilaiakhir<40){
            System.out.print("NILAI HURUF : E");
        }
        else if(nilaiakhir>=40 && nilaiakhir<=54){
            System.out.print("NILAI HURUF : D");
        }
        else if(nilaiakhir>=55 && nilaiakhir<=64){
            System.out.print("NILAI HURUF : C");
        }
        else if(nilaiakhir>=65 && nilaiakhir<=80){
            System.out.print("NILAI HURUF : B");
        }
        else {
            System.out.print("Nilai Huruf : A");
        }
        System.out.println();
    }
    
     public void ceklulus(float nilaiakhir) {
        
        if (nilaiakhir >= 70) {
            System.out.println("STATUS : LULUS");
        } else {
            System.out.println("STATUS : TIDAK LULUS");
        }
    }
}
