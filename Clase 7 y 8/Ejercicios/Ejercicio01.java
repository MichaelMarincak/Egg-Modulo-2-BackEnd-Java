package actividades.guia.pkg4;
import java.util.Scanner;

public class Ejercicio01 {

    /*
    Crea una aplicación que le pida dos números al usuario 
    y este pueda elegir entre sumar, restar, multiplicar y dividir.
    La aplicación debe tener una función para cada operación matemática
    y deben devolver sus resultados para imprimirlos en el main. 
    */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        int op;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt(); num2 = leer.nextInt();
        do {            
            
        System.out.println("Menu:\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija una opcion: ");
        op = leer.nextInt(); 
        switch (op) {
            case 1:
                System.out.println("La suma de los numeros es: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es: " + mul(num1, num2));
                break;  
            case 4:
                System.out.println("La division de los numeros es: " + div(num1, num2));
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        } while (op != 5);
    }
    public static double suma(double num1, double num2){
        num1 += num2;
        return num1;
    }
    public static double resta(double num1, double num2){
        num1 -= num2;
        return num1;
    }
     public static double mul(double num1, double num2){
        num1 *= num2;
        return num1;
    }
    public static double div(double num1, double num2){
        num1 /= num2;
        return num1;
    }
}
