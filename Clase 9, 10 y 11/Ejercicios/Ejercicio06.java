package actividades.guia.pkg5;
import java.util.Scanner;

public class Ejercicio06 {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por
    números del 1 al 9 donde la suma de sus filas, sus columnas
    y sus diagonales son idénticas. Crear un programa que 
    permita introducir un cuadrado por teclado y determine si
    este cuadrado es mágico o no. El programa deberá comprobar 
    que los números introducidos son correctos, es decir, están
    entre el 1 y el 9.
    */
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int m, n; double sumac, sumad, sumaf; double matriz[][]; boolean validar;
        
        System.out.println("ingrese la dimension de la matriz cuadrada");
        
        n = leer.nextInt(); m = n; matriz = new double[n][m];
        do {
            llenarmatriz(matriz, n, m); mostrarmatiz(matriz, n);
            sumaf = sumadorfilas(matriz, n);
            sumac = sumadorcolumnas(matriz, n);
            sumad = sumadordiagonales(matriz, n);
            validar = matrizmagica(sumad, sumac, sumaf);
        } while (validar == false);
    }

    public static boolean matrizmagica(double sumad, double sumac, double sumaf) {
        boolean retorno;
        if (sumac == sumaf && sumac == sumad) {retorno = true;
            System.out.println("Se encontro la matriz magica");
            System.out.printf("La suma de los valores de la matriz es: %.0f \n", sumad);
        } else {retorno = false;
            System.out.println("No se encontro la matriz magica");
        }
        return retorno;
    }

    public static double sumadordiagonales(double matriz[][], int n) {
        double sumadiagonal, aux, retorno; sumadiagonal = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 1; j++) {sumadiagonal += matriz[i][i]; }
        }
        aux = sumadiagonal; sumadiagonal = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {sumadiagonal += matriz[i][n - i - 1];}
        }
        if (aux != sumadiagonal) {retorno = 0;} else {retorno = aux;}
        return retorno;
    }

    public static double sumadorcolumnas(double matriz[][], double n) {
        double aux, contador, retorno, sumafilas; contador = 0; aux = 0;
        for (int i = 0; i < n ; i++) {sumafilas = 0;
            for (int j = 0; j < n ; j++) {
                sumafilas = sumafilas + matriz[j][i];
            }
            if (i == 0) {aux = sumafilas;}
            if (aux != sumafilas) {contador = 1;}
        }
        if (contador > 0) {retorno = 0;} else {retorno = aux;}
        return retorno;
    }

    public static double sumadorfilas(double matriz[][], double n) {
        double aux, contador, retorno, sumafilas; contador = 0; aux = 0;
        for (int i = 0; i < n ; i++) {sumafilas = 0;
            for (int j = 0; j < n ; j++) {
                sumafilas += matriz[i][j];
            }
            if (i == 0) {aux = sumafilas;}
            if (aux != sumafilas) {contador = 1;}
        }
        if (contador > 0) {retorno = -1;} else {retorno = aux;}
        return retorno;
    }

    public static void mostrarmatiz(double matriz[][], double n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {System.out.printf("[%.0f]", matriz[i][j]);}System.out.println("");}
        System.out.println("");
    }

    public static void llenarmatriz(double matriz[][], double n, double m) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {matriz[i][j] = Math.round((Math.random())*3);}
        }
    }

}


