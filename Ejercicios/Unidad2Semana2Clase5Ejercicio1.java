/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Unidad2Semana2Clase5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana2_Clase5_Ejercicio1");
       
        int year=5;
        String Branch = "CSE"; 
        
        
        switch (year)
        {
            case 1:
               {
                  System.out.print("Cursos electivos: Ingles, Calculo");
                   break;
               }
            
            case 2:
               {
                switch (Branch) //switch anidado
                   {
                    case "CSE":
                    case "CCE":
                        System.out.print("Cursos electivos: Machine learning, Big data");
                   break;
                        
                   case "ECE":     
                         System.out.print("Cursos electivos: Programación");
                   break;
                     
                   default:
                
                 System.out.print("Cursos electivos: Ingenieria de Software");
                 break;
                                       
                   }
                    
               } 
        }
        
    } //Fin codigo
    
} //Fin total
