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
public class Unidad1Semana4Clase11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana4_Clase11_Ejercicio1");
        
        //Declaración de variables
        float nota1, nota2, nota3, promedio;
        
         System.out.print("Ingrese la primera nota: ");
         nota1=entrada.nextFloat();
         
         System.out.print("Ingrese la segunda nota: ");
         nota2=entrada.nextFloat();
         
         System.out.print("Ingrese la tercera nota: ");
         nota3=entrada.nextFloat();
         
         promedio = (nota1+nota2+nota3)/3;
         
          System.out.print("El promedio es:" +promedio);
             
         if (promedio>=7)
        {
          System.out.print("Promocionado");
              
        }
         else if (promedio>=4)
        {
          System.out.print("Regular");
              
        }
         else
             {
                 System.out.print("Reprobado");
             }
        
    } //Fin codigo
    
} //Fin total
