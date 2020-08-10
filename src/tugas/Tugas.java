/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;


public class Tugas {

    public static void main(String[] args) {
        String warna = "Pink";
        int jumlah = 2;
        
        tugas2 Bola = new tugas2(warna, jumlah);
        Bola.ditangkap();
        Bola.ditendang();
        Bola.showData();
    }
    
}
