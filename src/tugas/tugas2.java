/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;


public class tugas2 {
    private String warna;
    private int jumlah;
    
    public tugas2 (String warna, int jumlah){
        this.warna = warna;
        this.jumlah = jumlah;
        System.out.println("Inisialisasi Atribut");
    }
    
    void ditendang (){
        System.out.println("Bola ditendang");
    }
    
    void ditangkap (){
        System.out.println("Bola ditangkap");
    }
    
    void showData (){
        System.out.println("Warna: "+this.warna);
        System.out.println("Jumlah: "+this.jumlah);
    }
}
