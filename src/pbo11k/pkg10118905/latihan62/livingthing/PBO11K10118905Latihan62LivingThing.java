/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan62.livingthing;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Living Thing
 */
public class PBO11K10118905Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human manusia = new Human();
        
        manusia.setNama("Anindira");
        manusia.walk(manusia.getNama());
        manusia.breath(manusia.getNama());
        manusia.eat(manusia.getNama());
    }
    
}
