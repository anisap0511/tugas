/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaspbo2;

/**
 *
 * @author Anisa Putri
 */
public class Baju2 {
    public static void main(String[] args) {
        Baju data = new Baju();
        
        data.setbaju("ZARA");
        data.sethargabaju(300000.0);
        data.setwarna("Pink");
        
        System.out.println("Merk Baju :"+data.getbaju());
        System.out.println("Harga Baju : Rp."+data.gethargabaju());
        System.out.println("Warna : "+data.getwarna());
    }
}
