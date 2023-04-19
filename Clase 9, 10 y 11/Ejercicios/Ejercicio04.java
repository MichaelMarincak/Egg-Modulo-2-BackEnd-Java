package actividades.guia.pkg5;
import java.util.Scanner;

public class Ejercicio04 {

    /*
    Realizar un programa que rellene un matriz de 3 x 3 de valores aleatorios 
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
    se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [][] matriz = new double [3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = Math.round((Math.random()*9));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%.0f]", matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%.0f]", matriz[j][i]);
            }
            System.out.println("");
        }
    }

}
