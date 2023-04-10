package ejemplo.guia.pkg2;
import java.util.Scanner;

public class ejercicio05 {

    /*"""
    Escribir un programa que lea un número entero por teclado 
    y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().

    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1;
        
        System.out.println("Ingrese un numero: ");
        
        num1 = leer.nextInt();
        
        System.out.println("El doble de " + num1 + " es: " + (num1 * 2) + "\nEl triple de " + num1 + " es: " + (num1 * 3)  + "\nLa raiz cuadrada de " + num1 + " es: " + (Math.sqrt(num1))+ "\n");
        
        System.out.format("El doble de %d es: %d \nEl triple de %d es: %d \nLa raiz cuadrada de %d es: %f \n", num1,(num1*2),num1,(num1*3),num1,(Math.sqrt(num1)));
    }

}
