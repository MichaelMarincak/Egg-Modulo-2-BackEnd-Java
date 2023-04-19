package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioExtra02 {

    /*
    Escriba un programa que averigüe si dos vectores de N
    enteros son iguales (la comparación deberá detenerse en
    cuanto se detecte alguna diferencia entre los elementos).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] vector1 = new double [5]; double[] vector2 = new double [5];
        for (int i = 0; i < 5; i++) {
            vector1[i]= Math.round((Math.random()*9));
            vector2[i]= Math.round((Math.random()*9));
        }
        for (int i = 0; i < 5; i++) {
            if (vector1[i] == vector2[i] ) {
                System.out.println("Los vectores son iguales");
            }else{
                System.out.println("Los vectores NO son iguales");
                break;
            }
 
        }
    }
}
