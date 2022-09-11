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
public class Unidad1Semana5Clase13Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana5_Clase13_Ejercicio1");
        
        //Declaración de variables
        int plato, cantidad;
        double totalInicial = 0, descuento, totalFinal = 0, precioPlato1 = 5, precioPlato2 = 7;
        
        System.out.print("Ingrese 1 o 2 segun el plato que desaea: ");
        plato=entrada.nextInt();
        
        System.out.print("Numero de órdenes: ");
        cantidad=entrada.nextInt();

         if (plato == 1)
        {
           if (cantidad >=1 && cantidad<=5)
               {
                   descuento= 0.05;
                   totalInicial=cantidad*precioPlato1;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else if (cantidad >=6 && cantidad<=10)
               {
                   descuento= 0.07;
                   totalInicial=cantidad*precioPlato1;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else if (cantidad >=11)
               {
                   descuento= 0.09;
                   totalInicial=cantidad*precioPlato1;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else 
               {
                   System.out.print("Cantidad equivocadas"); 
               }
           
        }
      else if (plato==2)
        {
                   if (cantidad >=1 && cantidad<=5)
               {
                   descuento= 0.06;
                   totalInicial=cantidad*precioPlato2;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else if (cantidad >=6 && cantidad<=10)
               {
                   descuento= 0.09;
                   totalInicial=cantidad*precioPlato2;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else if (cantidad >=11)
               {
                   descuento= 0.12;
                   totalInicial=cantidad*precioPlato2;
                   totalFinal=totalInicial-(totalInicial*descuento);
               }
           else 
               {
                   System.out.print("Cantidad equivocadas"); 
               }
        }
       else 
               {
                   System.out.print("Plato equivocado"); 
               }  
      
         System.out.print("El menu es:" +plato); 
         System.out.print("La cantidad es:"+cantidad); 
         System.out.print("El total inicial es:"+totalInicial); 
         System.out.print("El total final es:"+totalFinal); 
        
    } //Fin codigo
    
} //Fin total
