/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Kandos
 */
public class Test {
    public static void main(String[] args){
        
        Turunan turunan = new Turunan();
        Induk induk = new Induk();
        
        turunan.Overload();
        turunan.Overload("Raffli");
        
        induk.Override();
        turunan.Override();
    }
}
