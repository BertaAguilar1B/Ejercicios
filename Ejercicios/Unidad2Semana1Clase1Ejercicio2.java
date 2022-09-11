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
public class Unidad2Semana1Clase1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana1_Clase17_Ejercicio1");
       
         Scanner entrada = new Scanner (System.in);
         int num1, num2, resultado, opcion;
         
        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.print("+++++ Menú de opciones +++++");
        System.out.print("Para sumar los dos números, digite 1");
        System.out.print("Para restar los dos números, digite 2");
        System.out.print("Para elevarlos al cuadrado, digite 3");
        System.out.print("Para multiplircarlos, digite 4");
        opcion = entrada.nextInt();
        
        switch (opcion)
        {
            case 1:
               {
                   resultado = num1 + num2;
                   System.out.print("El resultado de la suma es:" +resultado);
               }
            
            case 2:
               {
                   resultado = num1 - num2;
                   System.out.print("El resultado de la resta es:" +resultado);
               } 
            case 3:
               {
                   System.out.print("El resultado de elevar al cuadrado" +num1+"es:"+ Math.pow(num1,2));
                   System.out.print("El resultado de elevar al cuadrado" +num2+"es:"+ Math.pow(num2,2));
               }
            case 4:
               {
                   resultado = num1*num2;
                   System.out.print("El resultado de la multiplicación es:" +resultado);
               }
            default:
                {
                 System.out.print("Seleccione una opción correcta");
                 break;
               }
        }
        
    } //Fin codigo
    
} //Fin total
