package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioTeorico05 {

    /*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
    e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
    Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        do {
            System.out.println("ingrese un numero entre 1 y 20");
            num1 = leer.nextInt();
        } while (num1 > 20 || num1 < 1);
        do {
            System.out.println("ingrese un numero entre 1 y 20");
            num2 = leer.nextInt();
        } while (num2 > 20 || num2 < 1);
        do {
            System.out.println("ingrese un numero entre 1 y 20");
            num3 = leer.nextInt();
        } while (num3 > 20 || num3 < 1);
        do {
            System.out.println("ingrese un numero entre 1 y 20");
            num4 = leer.nextInt();
        } while (num4 > 20 || num4 < 1);
        for (int i = 0; i < 1; i++) {
            System.out.print(num1 + " ");
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int k = 0; i < 1; i++) {
                System.out.print(num2 + " ");
                for (int j = 0; j < num2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
                for (int l = 0; i < 1; i++) {
                    System.out.print(num3 + " ");
                    for (int j = 0; j < num3; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    for (int m = 0; i < 1; i++) {
                        System.out.print(num4 + " ");
                        for (int j = 0; j < num4; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }

            }
        }
    }
}
