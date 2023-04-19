package actividades.guia.pkg5;
import java.util.Scanner;

public class Ejercicio05 {

    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
    propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
    si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
    obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [][] matriz = new double [3][3]; boolean aux = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[i][j] != matriz[j][i] || matriz[j][i] == 0 || matriz[i][j] == 0 )) {aux = true;}else{aux = false;} 
            }
        }
        if (aux) {System.out.println("La matriz dada es antisimétrica.");}else{System.out.println("La matriz dada 'NO' es antisimétrica.");}
    }

}
