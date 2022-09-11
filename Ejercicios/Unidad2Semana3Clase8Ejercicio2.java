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
public class Unidad2Semana3Clase8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana3_Clase8_Ejercicio2");
        
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.print("Ingrese el numero:");
        
        numero = entrada.nextInt();
        
        for(int i=1; i<=10; i++)
            {
                 System.out.print(numero+" * "+i+" = "+numero*i);
            }
        
    } //Fin codigo
    
} //Fin total
