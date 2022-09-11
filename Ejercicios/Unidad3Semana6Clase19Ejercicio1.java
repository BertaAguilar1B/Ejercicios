/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Unidad3Semana6Clase19Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana2_Clase4_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int password;
        
     do {
          System.out.print("Ingrese su contraseña numérica: ");
          password=entrada.nextInt();
          
          if (password != 1234) 
              {
                  System.out.print("La contraseña no es válida ");
              }
     } while (password != 1234);

  
    }//Fin codigo
    
}//Fin 
