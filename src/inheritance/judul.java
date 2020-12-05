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
public class judul extends band{
    private String judul;
    
    public String getJudul(){
       return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public void callJudul(){
        System.out.println("Judul");
        super.callBand();
    }
}
