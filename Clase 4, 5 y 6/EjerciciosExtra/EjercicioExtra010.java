package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioExtra010 {

    /*
    Realice un programa para que el usuario adivine
    el resultado de una multiplicación entre dos números 
    generados aleatoriamente entre 0 y 10. El programa 
    debe indicar al usuario si su respuesta es o no correcta. 
    En caso que la respuesta sea incorrecta se debe permitir 
    al usuario ingresar su respuesta nuevamente. Para realizar 
    este ejercicio investigue como utilizar la función Math.random() de Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1 = (Math.random() * 9), num2 = (Math.random() * 9), mul = (Math.round(num1 * num2)), R;
        System.out.println(mul);
        do {            
        System.out.println("Ingrese un numero para averiguar el resultado: ");
        R = leer.nextDouble();
            if (R != mul) {
                System.out.println("Numero incorrecto, vuelva a intentar");
            }
        } while (R != mul);
        System.out.println("Acerto el numero");
    }

}
