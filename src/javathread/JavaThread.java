/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gguag
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ProcessoRunnable p1 = new ProcessoRunnable("p1");
//        Thread t1 = new Thread(p1);
//        t1.start();
//        try {
//            
//            Thread.sleep(5000);
//            p1.stoppa();
//            
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
////        ProcessoRunnable p1 = new ProcessoRunnable("p1");
////        Thread t1 = new Thread(p1);
////        t1.start();
//        

//        Conto c = new Conto(2000);
//        Sportello sport1 = new Sportello (c);
//        Sportello sport2 = new Sportello (c);
//        Thread genitore1 = new Thread(sport1);
//        Thread genitore2 = new Thread(sport2);
//        
//        genitore1.start();
//        genitore2.start();
        
//        sport1.versa(500);
//        sport2.versa(800);

    Conto conto = new Conto(1000);
    Sportello ATM1 = new Sportello(conto, "MAMMA");
    Sportello ATM2 = new Sportello(conto, "PAPA'");
    Thread mamma = new Thread(ATM1);
    Thread papa = new Thread(ATM2);
    
    mamma.start();
    papa.start();
    
    int qualeThread; // 0 = mamma ; 1 = papa
    int cheOperazione; // 0 = versa ; 1 = preleva
    int quanto;

    while(true){
        System.out.println("");
        
        qualeThread = (int) (Math.random()*2);
        
        if(qualeThread == 0){
            System.out.print("MAMMA ");
        }else{
            System.out.print("PAPÀ ");
        }
        
        cheOperazione = (int) (Math.random()*2);
        
        if(cheOperazione == 0){
            System.out.print("VERSA ");
        }else{
            System.out.print("PRELEVA ");
        }
        
        quanto = (int) (Math.random()*501);
        System.out.print(quanto + " €");
        System.out.println("");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("ECCEZIONE \"InterruptedException\" NEL MAIN");
        }
        
    }
    
        
    }
    
}
