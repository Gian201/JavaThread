/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author gguag
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processo T1 = new Processo("T1");
        Processo T2 = new Processo("T2");
        T1.run();
        T2.run();
        
    }
    
}