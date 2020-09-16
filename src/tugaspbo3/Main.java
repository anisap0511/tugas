/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo3;

/**
 *
 * @author Anisa Putri
 */
public class Main {
    public static void main(String[] args){
      
    
    //overloading pada constructor
    Player player1 = new Player ("Saitama");
    Player player2 = new Player ();
    Player player3 = new Player ();
    Player player4 = new Player ("Asta");
    
    player1.show();
    player2.show();
    player3.show();
    player4.show();
    
    //overloading methods
    int a = Matematika.kurang(100, 20);
     System.out.println(a);
    double b = Matematika.kurang (10, 1.8);
    System.out.println(b);
}
}


