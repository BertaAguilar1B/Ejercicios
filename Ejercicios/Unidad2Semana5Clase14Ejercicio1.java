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
public class Unidad2Semana5Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad2_Semana5_Clase14_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int numlados;
        System.out.print("Numero de lados");
        numlados=entrada.nextInt();
        
        switch(numlados)
        {
            case 1:
            System.out.print("No es figura"); 
            break;
            case 2:
            System.out.print("No es figura"); 
             break;
            case 3:
            System.out.print("No es Triangulo"); 
            break;
            case 4:
            System.out.print("No es Cuadrado o rectangulo");
            break;
            case 5:
            System.out.print("Pentagono");
               break; 
            case 6:
            System.out.print("No es Hexagono");
            break;
            case 7:
            System.out.print("No es Heptagono");
               break; 
            case 8:
            System.out.print("No es Octagono");
            break;
            default:
             System.out.print("No registrada");   
        }
        
       
    } //Fin codigo
    
} //Fin total
