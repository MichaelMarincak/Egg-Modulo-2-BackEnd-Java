package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioExtra05 {

    /*
    Realizar un programa que llene una matriz de tamaño NxM 
    con valores aleatorios y muestre la suma de sus elementos.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m, aux = 0;
        System.out.println("Ingrese la dimension de la matriz"); n = leer.nextInt(); m = leer.nextInt();
        double [][] matriz = new double [n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Math.round((Math.random()*9));
                aux += matriz[i][j];
            }
        }
        System.out.println("La suma lo elementos de la matriz es: " + aux);
    }
}
