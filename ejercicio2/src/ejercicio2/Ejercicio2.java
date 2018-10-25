/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //necesito la posicion 10001
        //que el numero sea primo
        int pos = 1;
        int i = 3;
        int va = 0;
        while (pos < 10001) {
            boolean x = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                 x = false;
                }              
          }
            if(x == true){
            pos++;
            }    
            va=i;
             i++;
        }
        JOptionPane.showMessageDialog(null, "pos="+pos + "\n" + "numero="+ va);

       
    }

}
