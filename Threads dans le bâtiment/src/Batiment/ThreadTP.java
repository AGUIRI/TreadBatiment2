/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Batiment;

/**
 *
 * @author raguiri
 */
public class ThreadTP {
    
      public static void main (String[]args) throws InterruptedException{
        Electricien E1= new Electricien();
        Electricien E2= new Electricien();
        Electricien E3= new Electricien();
        Platrier P1= new Platrier();
        Platrier P2= new Platrier();
        E1.travailler();
        E2.travailler();
        E3.travailler();
        P1.travailler();
        P2.travailler();
        System.out.println("Tous les ouvriers ont fini leur travail");
    }
    
    
}
