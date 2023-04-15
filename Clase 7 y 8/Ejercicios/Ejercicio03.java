package actividades.guia.pkg4;
import java.util.Scanner;

public class Ejercicio03 {

    /*
    Crea una aplicación que a través de una función nos convierta una
    cantidad de euros introducida por teclado a otra moneda, estas pueden
    ser a dólares, yenes o libras. La función tendrá como parámetros, la 
    cantidad de euros y la moneda a convertir que será una cadena, este no
    devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double E;
        String op;
        System.out.println("Ingrese la cantidad de euros que quiere convertir: ");
        E = leer.nextInt();
        System.out.println("A que moneda lo quiere convertir? (L/D/Y)");
        op = leer.next();
        Cambio(op,E);
    }
    public static void Cambio(String op, double E){
        switch (op.toLowerCase()) {
            case "l":
                E *= 0.86;
                System.out.printf("Su convercion es de: %.2f libras \n", E );
                break;
            case "d":
                E *= 1.28611;
                System.out.printf("Su convercion es de: %.2f dolares \n", E );
                break;
            case "y":
                E *= 129856;
                System.out.printf("Su convercion es de: %.2f yenes \n", E );
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    
}
