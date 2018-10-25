/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Jesus
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lim = 1000;
        int suma=0;
        for (int i = 0; i < lim; i++) {
            if((i%3==0) || (i%5==0)){
            suma+=i;
            }
        }
        System.out.println(suma);
    }
    
}
