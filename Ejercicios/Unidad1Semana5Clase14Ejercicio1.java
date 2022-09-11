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
public class Unidad1Semana5Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana5_Clase14_Ejercicio1");
        
        //Declaración de variables
        int reglas;
        double nota;
        
         System.out.print("Usted cumple las reglas de la universidad: ");
         System.out.print("Ingrese un numero: \n 1.Siempre \n 2.Aveces \n 3.Nunca");
         reglas=entrada.nextInt();
         
         System.out.print("Que nota obtuvo en el laboratorio: ");
         nota=entrada.nextDouble();
        
             
         if (reglas==1)
        {
            if (nota>=8 && nota<=10)
                {
                    nota = 10;
                }
            else
                {
                    System.out.print("Nota invalida");
                }   
        }
         else if (reglas==2)
        {
           if (nota<6)
                {
                    nota = nota+0.5;
                }
          else if (nota>=6 && nota<8)
                {
                    nota = nota+0.7;
                }
            else
                {
                    System.out.print("Nota invalida");
                }   
        }
         else
             {
                 System.out.print("Usted debe cumplir las reglas");
             }
         
         System.out.print("La nueva nota es:" +nota);
        
    } //Fin codigo
    
} //Fin total
