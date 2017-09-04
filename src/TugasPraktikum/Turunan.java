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
class Turunan extends Induk{
    public void Overload(String s){
        System.out.println("Method di dalam kelas Turunan (Overload)");
        System.out.println("S : \""+ s + "\"");
    }
    public void Override(){
        System.out.println("Method di dalam kelas Turunan (Override)");
}
}
