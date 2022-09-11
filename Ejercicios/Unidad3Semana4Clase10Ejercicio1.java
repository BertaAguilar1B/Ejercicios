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
public class Unidad3Semana4Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana4_Clase10_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int fact=1, num, cont=1;
        
        System.out.print("Ingrese un número:");
        num= entrada.nextInt(); 
       
        do {
            fact=fact*cont;
            cont=cont+1;
        }
        while (cont<=num);
        System.out.print("El factorial es "+fact);
        
  
    }//Fin codigo
    
}//Fin 
