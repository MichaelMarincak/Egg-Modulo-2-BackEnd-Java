package actividades.guia.pkg4;
import java.util.Scanner;

public class Ejercicio02 {

    /*
    Diseñe una función que pida el nombre y la edad de N personas e
    imprima los datos de las personas ingresadas por teclado e indique
    si son mayores o menores de edad. Después de cada persona, el programa
    debe preguntarle al usuario si quiere seguir mostrando personas y frenar
    cuando el usuario ingrese la palabra “No”.
    */
    public static void main(String[] args) {
        informe();
    }
    
    public static void informe() {
        Scanner leer = new Scanner(System.in);
        String nombre, op;
        int edad;

        do {
            System.out.println("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " tiene " + edad + " años y es mayor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " años y no es mayor de edad");
            }
            do {                
            System.out.println("Desea seguir mostrando personas (S/N)");
            op = leer.next();   
            } while (op.equalsIgnoreCase("S") || op.equalsIgnoreCase("N"));
            if (op.equalsIgnoreCase("N")) {
                break;
            }
        } while (!op.equalsIgnoreCase("N"));

    }
}


