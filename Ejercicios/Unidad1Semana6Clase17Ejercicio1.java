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
public class Unidad1Semana6Clase17Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Unidad1_Semana6_Clase17_Ejercicio1");
        
        //Declaración de variables
        String nombre, clave;
        
         System.out.print("Ingrese nombre de usuario: ");
         nombre=entrada.nextLine();
         System.out.print("Ingrese clave de usuario: ");
         clave=entrada.nextLine();
         
         if (nombre.equals("Juan") && clave.equals("123456"))
             {
                 System.out.print("Bienvenido al sistema");
             }
         else 
             {
                 System.out.print("Nombre de usuario o contraseña incorrecta");
             }
         
         
         
    } //Fin codigo
    
} //Fin total
