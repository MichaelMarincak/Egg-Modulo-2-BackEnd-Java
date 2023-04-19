package actividades.guia.pkg5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

    /*
    Realizar un algoritmo que llene un vector de tamaño N con 
    valores aleatorios y le pida al usuario un número a buscar en el vector.
    El programa mostrará dónde se encuentra el numero y si se encuentra repetido
    */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double[] vector = new double[5]; int r = 0; int aux = 0;
        for (int i = 0; i < 4; i++) {
            vector[i] = (Math.round(Math.random() * 9));
            //                        0.0 - 1.0  * 9 = 5.33
            System.out.println(vector[i]);
        }
        while (true) {
            try {
                System.out.println("Ingrese un numero a buscar entre 1 y 10");
                r = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: No se puede ingresar una letra");
                leer.next();
            }
        }

        for (int i = 0; i < 4; i++) {
            if (vector[i] == r) {
                aux++;
                if (aux > 1) {
                    System.out.println("El numero " + r + " se encuentra en la posición: " + i
                            + "\nY se repite " + aux + " veces.");
                } else {
                    System.out.println("El numero " + r + " se encuentra en la posición: " + i);
                }
            }
        }

    }    
}
