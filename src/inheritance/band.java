/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Anisa Putri
 */
public class band {
    protected String nama_band;
    
    public String getNama_band(){
        return nama_band;
    }
    
    public void setNama_band(String nama_band){
        this.nama_band = nama_band;
    }
    
    public void callBand(){
        System.out.println("Nama Band: "+getNama_band());
    }
}
