/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author micha
 */
public class ejercicio02 {

    /**
     * Escribir un programa que pida tu nombre, 
     * lo guarde en una variable y lo muestre por pantalla.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        
        if (!leer.hasNextInt()) {
            nombre = leer.next();
            System.out.println("Hola!! " + nombre);
        } else {
            System.out.println("Error");
        }
       
    }
    
}
