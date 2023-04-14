package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioExtra09 {

    /*
    Simular la división usando solamente restas. 
    Dados dos números enteros mayores que uno,
    realizar un algoritmo que calcule el cociente
    y el residuo usando sólo restas. 
    Método: Restar el dividendo del divisor hasta obtener 
    un resultado menor que el divisor, este resultado es el residuo,
    y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37     una resta realizada
    37 – 13 = 24     dos restas realizadas
    24 – 13 = 11     tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux,num1, num2;
        aux = 0;
                   
        do { 
        System.out.println("Ingrese dos numeros enteros mayores que uno a dividir (A/B)");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        } while (num1 < 1 || num2 < 1);
        while (num1 > num2) {
            num1 -= num2;
            aux++;
        }
        System.out.println("El residuo es: " + num1 
                + "\nEl cociente es: " + aux);
    }

}
