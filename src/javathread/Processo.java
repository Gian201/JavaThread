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
public class Processo extends Thread{
    private String nome;
    
    public Processo(String nome){
        this.nome = nome;
    
    }
    
    public void run(){
        int i = 0;
        for(;;i++){
            System.out.println(nome+" "+i);
        }
        
    }
    
}
