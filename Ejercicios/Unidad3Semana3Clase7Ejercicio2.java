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
public class Unidad3Semana3Clase7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana3_Clase7_Ejercicio2");
        
        Scanner entrada = new Scanner (System.in);
        int contador;
        int fin;
        
        System.out.print("Por favor ingrese el valor inicial (Contador)");
        contador = entrada.nextInt(); 
        System.out.print("Por favor ingrese el valor final");
        fin = entrada.nextInt(); 
        
        while (contador<=fin)
        {
            System.out.print("Valor actual de la iteración"+contador);
            contador++;
        }
  
    }//Fin codigo
    
}//Fin 
