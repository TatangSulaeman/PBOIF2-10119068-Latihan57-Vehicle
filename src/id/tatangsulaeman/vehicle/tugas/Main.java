/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.vehicle.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Vehicle
 * 
 */
public class Main {
    public static void main(String[] args){
        
        
        Bicycle datB = new Bicycle();
        datB.setMyBrand("TrekBike");
        datB.setMyModel("7.4FX");
        datB.setMyGearCount(23);
        //output
        System.out.println("Brand : " + datB.getMyBrand());
        System.out.println("Model : " + datB.getMyModel());
        System.out.println("Jumlah Gear : " + datB.getMyGearCount());
        
        System.out.println();
        
        Skateboard datS = new Skateboard();
        datS.setMyBrand("Ally Skate");
        datS.setMyModel("Rocket");
        datS.setMyBoardLength(54.5);
        //output
        System.out.println("Brand : " + datS.getMyBrand());
        System.out.println("Model : " + datS.getMyModel());
        System.out.println("Panjangnya Board : " + datS.getMyBoardLength());
        
    }
}
