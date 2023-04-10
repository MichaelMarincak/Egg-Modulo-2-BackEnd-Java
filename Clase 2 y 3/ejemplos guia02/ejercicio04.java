package ejemplo.guia.pkg2;
import java.util.Scanner;

public class ejercicio04 {

    /*Dada una cantidad de grados centígrados se debe mostrar 
    su equivalente en grados Fahrenheit.
    La fórmula correspondiente es: F = 32 + (9 * C / 5).   
    */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double C, F;
        
        System.out.println("ingrese una temperatura en grados Cº: ");
        if (leer.hasNextDouble()) {
        C = leer.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println("La temperatura en grados Fº es: " + F);     
        }else {
            System.out.println("Error");            
        } 
            
        
        
    }

}
