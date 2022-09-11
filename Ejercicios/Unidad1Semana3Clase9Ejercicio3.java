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
public class Unidad1Semana3Clase9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana3_Clase9_Ejercicio3");
        
        //Declaración de variables
        int numero1;
        
         System.out.print("Escriba el primer numero entero:");
         numero1=entrada.nextInt();
         
         if (numero1 >=100)
        {
           System.out.print("El numero " +numero1 + "es mayor o igual que 100");    
        }
         else if (numero1 >=50)
        {
           System.out.print("El numero " +numero1 + "es mayor o igual que 50 pero menor que 100");    
        }  
         else if (numero1 >=0)
        {
           System.out.print("El numero " +numero1 + "es mayor o igual que 0 pero menor que 100");    
        } 
         else 
        {
           System.out.print("El numero " +numero1 + "es menor que 0");    
        } 
       
        
    } //Fin codigo
    
} //Fin total
