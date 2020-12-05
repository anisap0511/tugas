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
public class pop extends band{
    
    private String jenis;
    
    public String getJenis(){
       return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void callJenis(){
        System.out.println("Pop");
        super.callBand();
    }
}
