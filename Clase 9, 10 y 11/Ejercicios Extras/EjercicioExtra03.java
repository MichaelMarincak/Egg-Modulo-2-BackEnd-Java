package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioExtra03 {

    /*
    Crear una función rellene un vector con números aleatorios,
    pasándole un arreglo por parámetro. Después haremos otra función
    o procedimiento que imprima el vector.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[5];
        llenarvector(vector);
        motrarvector(vector);
    }
    public static void llenarvector(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= Math.round((Math.random()*9));
        }
    }
    public static void motrarvector(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("[%.0f] ", vector[i]);
        }
        System.out.println("");
    }
}
