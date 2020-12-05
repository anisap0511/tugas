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
public class instrumen extends band{
    private String instrumen;
    
    public String getInstrumen(){
       return instrumen;
    }
    
    public void setInstrumen(String instrumen){
        this.instrumen = instrumen;
    }
    
    public void callInstrumen(){
        System.out.println("Instrumen");
        super.callBand();
    }
    
}
