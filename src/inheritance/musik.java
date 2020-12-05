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
public class musik {
    
    public static void main(String[]args){
        pop pp = new pop();
        judul jd = new judul();
        instrumen is = new instrumen();
        
        pp.setNama_band("Andmesh");
        pp.setJenis("Pop");
        pp.callJenis();
        System.out.println("Jenis Musik: "+pp.getJenis());
        System.out.println("================================================");
        
        jd.setNama_band("Andmesh");
        jd.setJudul("Kumau dia");
        jd.callJudul();
        System.out.println("Judul Lagu: "+jd.getJudul());
        System.out.println("================================================");
        
        is.setNama_band("Andmesh");
        is.setInstrumen("Piano");
        is.callInstrumen();
        System.out.println("Lead Instrument: "+is.getInstrumen());
        System.out.println("================================================");
    }
}
