package actividades.guia.pkg3;
import java.util.Scanner;

public class Ejercicio05 {

    /*
    Escriba un programa en el cual se ingrese un valor límite positivo,
    y a continuación solicite números al usuario hasta que la suma de los
    números introducidos supere el límite inicial.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        suma = 0;
        System.out.println("Ingrese un limite inicial");
        num1 = leer.nextInt();
        do {            
            System.out.println("ingrese un numero");
            num2 = leer.nextInt();
            suma = suma + num2;
        } while (suma != num1 && suma < num1);
    }

}
