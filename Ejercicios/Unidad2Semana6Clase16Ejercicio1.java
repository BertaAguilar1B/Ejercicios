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
public class Unidad2Semana6Clase16Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana6_Clase16_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int fact=1;
        int num=0;
        System.out.print("Introduce numero");
        num=entrada.nextInt();
        
        for(int ind=1; ind<=num; ind++)
        {
            fact*=ind;
        }  
         System.out.print("El factorial es: "+fact);
        
    } //Fin codigo
    
} //Fin total
