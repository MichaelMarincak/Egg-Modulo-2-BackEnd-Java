package actividades.guia.pkg5;

import java.util.Scanner;

public class Ejercicio03 {

    /*
    Recorrer un vector de N enteros contabilizando cuántos
    números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[10]; int aux;
        for (int i = 0; i < 9; i++) {
            do {
                aux = 0;
                System.out.println("Ingrese un numero");
                vector[i] = leer.nextInt();
            } while (vector[i] > 99999);
            while (vector[i] > 1) {
                vector[i] /= 10;
                aux++;
            }
            switch (aux) {
                case 1: System.out.println("El numero ingresado tiene 1 digito");break;
                case 2: System.out.println("El numero ingresado tiene 2 digitos");break;
                case 3: System.out.println("El numero ingresado tiene 3 digitos");break;
                case 4: System.out.println("El numero ingresado tiene 4 digitos");break;
                case 5: System.out.println("El numero ingresado tiene 5 digitos");break;
            }
        }
    }

}
