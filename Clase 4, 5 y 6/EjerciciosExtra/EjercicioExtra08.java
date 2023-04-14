package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioExtra08 {

    /*
    Escriba un programa que lea números enteros.
    Si el número es múltiplo de cinco debe detener
    la lectura y mostrar la cantidad de números leídos,
    la cantidad de números pares y la cantidad de números impares.
    Al igual que en el ejercicio anterior los números 
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, aux = 0, par = 0, impar = 0;
        
        do {
            System.out.println("Ingrese un numero");
            n = leer.nextInt();
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            aux++;
            if (n % 5 == 0) {
                break;
            }

        } while (n > 0);
        System.out.println("La cantidad de números leídos es: " + aux
                + "\nLa cantidad de números pares es: " + par
                + "\nLa cantidad de números impares es: " + impar);
    }

}
