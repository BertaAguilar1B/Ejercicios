/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Unidad3Semana7Clase20Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana2_Clase4_Ejercicio1");
        
        int a, b, respuesta;
        String accion;
        Scanner entrada;
        
     do {
          System.out.print("Ingrese el primer numero: ");
          entrada = new Scanner (System.in);
          a=Integer.valueOf(entrada.nextLine());
          System.out.print("Ingrese el segundo numero: ");
          b=Integer.valueOf(entrada.nextLine());
          respuesta= a-b;
          System.out.print(String.valueOf(a)+"+"+String.valueOf(b)+"="+String.valueOf(a+b));
          
           System.out.print("Quieres calcular la suma de otros dos numeros? S/N");
           Scanner teclado = new Scanner (in);
           accion=teclado.nextLine();
        
     } while (accion.equals("S") || accion.equals("s"));

  
    }//Fin codigo
    
}//Fin 
