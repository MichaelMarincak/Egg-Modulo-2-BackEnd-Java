package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioExtra011 {

    /*
    Escribir un programa que lea un número entero y devuelva el número 
    de dígitos que componen ese número. Por ejemplo, si introducimos el
    número 12345, el programa deberá devolver 5. Calcular la cantidad de
    dígitos matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los números o resultados.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String num = leer.next();
        System.out.println("El numero tiene " + num.length() + " digitos");
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("Se introdujeron " + contador + " digitos");
    }

}
