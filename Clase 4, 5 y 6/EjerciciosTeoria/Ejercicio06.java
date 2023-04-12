package actividades.guia.pkg3;
import java.util.Scanner;

public class Ejercicio06 {

    /*
    Realizar un programa que pida dos números enteros positivos
    por teclado y muestre por pantalla el siguiente menú:
    El usuario deberá elegir una opción y el programa deberá mostrar
    el resultado por pantalla y luego volver al menú. El programa deberá
    ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
    si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación:
    ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa,
    caso contrario se vuelve a mostrar el menú.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String R;
        double num1, num2;
        int op;
        System.out.println("Ingrese dos numeros enteros positivos: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        
        
        do { 
            System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción: ");
        op = leer.nextInt();
        switch (op) {
            
            case 1:
                System.out.println("La suma de los numeros " + num1 + " y " + num2 + " es: " + (num1 + num2) + "\n");
                break;
            case 2:
                System.out.println("La resta de los numeros " + num1 + " y " + num2 + " es: " + (num1 - num2)+ "\n");
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros " + num1 + " y " + num2 + " es: " + (num1 * num2)+ "\n");
                break;
            case 4:
                System.out.println("La division de los numeros " + num1 + " y " + num2 + " es: " + (num1 / num2)+ "\n");
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?" );
                R = leer.next();
                
                if (!R.equalsIgnoreCase("s")) {
                }else {
                    break;  
                }
                break;
            default:
                System.out.println("Numero no valido");
        }
        } while (op != 5);
    }

}
