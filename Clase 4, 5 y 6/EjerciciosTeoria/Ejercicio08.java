package actividades.guia.pkg3;
import java.util.Scanner;

public class Ejercicio08 {

    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print(" * ");
                }else if (i==j ) {
                    System.out.print("X    ");
                }
            }
            System.out.println("");
        }
    }

}
