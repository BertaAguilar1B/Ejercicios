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
public class Unidad2Semana4Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana4_Clase10_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int suma=0, num;
        double promedio;
        
        for(int i=1; i<=5; i++)
            {
                 System.out.print("Ingresar el numero "+i);
                 num=entrada.nextInt();
                 suma=suma+num;
            }
        promedio=suma/5;
        System.out.print("IEl promedio es:"+promedio);
        
    } //Fin codigo
    
} //Fin total
