package actividades.guia.pkg3;
import java.util.Scanner;

public class Ejercicio01 {

    /*
    Crear un programa que dado un número determine si es par o impar.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
        } else {
            System.out.println("El numero " + num + " es impar.");
        }
    }

}
