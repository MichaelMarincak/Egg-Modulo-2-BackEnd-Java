package ejemplo.guia.pkg2;
import java.util.Scanner;


public class Ejercicio03 {

    /*Escribir un programa que pida una frase 
      y la muestre toda en mayúsculas y después toda en minúsculas. 
      Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase; 
        
        System.out.println("Ingrese una frase: ");
        
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

}
