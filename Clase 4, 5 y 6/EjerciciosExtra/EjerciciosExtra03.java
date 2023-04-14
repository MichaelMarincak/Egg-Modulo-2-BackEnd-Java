package actividades.guia.pkg3;
import java.util.Scanner;

public class EjerciciosExtra03 {

    /*
    Elaborar un algoritmo en el cuál se ingrese una letra 
    y se detecte si se trata de una vocal. Caso contrario
    mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        switch (letra.toUpperCase()) {
            case "A": case "E": case "I": case "O": case "U":
                 System.out.println("La letra ingresada es una vocal");
                break;
            default:
                 System.out.println("La letra ingresada no es una vocal");
        }
       
    }

}
