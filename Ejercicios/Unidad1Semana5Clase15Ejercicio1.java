/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Unidad1Semana5Clase15Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana5_Clase15_Ejercicio1");
        
        //Declaración de variables
        double base, exponente, resultado;
        
         System.out.print("Ingrese la base: ");
         base=entrada.nextDouble();
         System.out.print("Ingrese el exponente: ");
         exponente=entrada.nextDouble();
         
         resultado = Math.pow(base, exponente);
         
         System.out.print("El resultado es: "+resultado);
         
    } //Fin codigo
    
} //Fin total
