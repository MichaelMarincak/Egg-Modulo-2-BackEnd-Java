package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioExtra01 {

    /*
    Realizar un algoritmo que calcule la suma de todos los elementos
    de un vector de tamaño N, con los valores ingresados por el usuario.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [5]; int aux = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero");
            vector[i] = leer.nextInt(); aux += vector[i];
        }
        System.out.println("La suma de los valores ingresados es: " + aux);
    }
}
