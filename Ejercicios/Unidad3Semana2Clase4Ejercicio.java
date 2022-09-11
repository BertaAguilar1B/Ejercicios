/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Unidad3Semana2Clase4Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana2_Clase4_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int valinicial, valfinal;
        
        valinicial=8;
        
        System.out.print("Multiplos de 8 hasta 500");
              
        while (valinicial<=500)
        {
            System.out.print(valinicial+",");
            valinicial=valinicial+8;
        }
  
    }//Fin codigo
    
}//Fin 
