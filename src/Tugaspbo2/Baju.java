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
public class Baju {
     private String baju;
    private double hargabaju;
    private String warna;
    
    
    public void setbaju(String baju){
        this.baju = baju;
    }
    
    public void sethargabaju(double hargabaju){
        this.hargabaju = hargabaju;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
    
    public String getbaju(){
        return baju;
    }
    
    public double gethargabaju(){
        return hargabaju;
    }
    
    public String getwarna(){
        return warna;
    }
}
