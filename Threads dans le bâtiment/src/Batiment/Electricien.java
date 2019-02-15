/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Batiment;

import static java.lang.Thread.*;

/**
 *
 * @author raguiri
 */
public class Electricien extends Ouvrier {
    private String name;
    private String profession;

    public void travailler() throws InterruptedException {
        for (int i=0;i<10;i++){
            System.out.println("je suis"+getName()+"je travaille comme"+getProfession()+"et je commence à travailler");
            sleep(5000);
        }
        System.out.println("je suis"+getName()+"je travaille comme"+getProfession()+"et j'ai fini mon travail");
    }
   
    
    private String getName() {
        return name;
    }

    private String getProfession() {
        return profession;
    }
  
}
