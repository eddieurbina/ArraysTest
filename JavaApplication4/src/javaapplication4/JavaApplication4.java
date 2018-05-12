/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Alumno
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] arregloEntero = new int[10][10]; 
        int n = 1; 
                
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) {
                 arregloEntero[i][j] = n;
                 n++;
            }
        }
        
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) { 
                System.out.print("\t" + arregloEntero[i][j]);
            }
            System.out.println("");
        }
       /*
        for (int i = 0; i<20; i++) { //Rellenar Variable 
            arregloEntero[i] = i * 3;
            if (arregloEntero[i]%2 != 0 ) 
                System.out.println(arregloEntero[i]);
        }
        
         for (int i = 0; i<20; i++) { 
           // System.out.println(arregloEntero[i]);
        }*/
        
        
        
        
        
    }
    
}
