/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Batiment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raguiri
 */
public abstract  class Ouvrier extends Thread {
    
      public void run()  {
          try {
              travailler();
          } catch (Exception ex) {
              Logger.getLogger(Ouvrier.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    
      abstract void travailler()throws Exception;
    

}
