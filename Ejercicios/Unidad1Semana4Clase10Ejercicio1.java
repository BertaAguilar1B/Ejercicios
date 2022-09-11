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
public class Unidad1Semana4Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana4_Clase10_Ejercicio1");
        
        //Declaración de variables
        double precio, prima, descuento, deuda, cuota;
        
         System.out.print("Ingrese el numero de meses: ");
         float NM=entrada.nextFloat();
         
         if (NM >=1 && NM<=65)
        {
          precio = 2300*1.13;
          descuento = 0;
          
          if (NM==36)
              {
                  descuento = precio*0.2;
                  prima = (precio-descuento)*0.15;
                  deuda = (precio - descuento)-prima;
              }
          else
              {
                  prima = precio*0.15;
                  deuda = precio-prima;
              }
          cuota = deuda/NM;
          System.out.print("Precio:"+precio);
          System.out.print("Descuento:"+descuento);
          System.out.print("Deuda:"+deuda);
          System.out.print("Cuota:"+cuota);
        }
         else
             {
                 System.out.print("Lo siento corazon, lea por favor");
             }
        
    } //Fin codigo
    
} //Fin total
