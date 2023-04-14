package actividades.guia.pkg3;
import java.util.Scanner;

public class EjerciciosExtra05 {

    /*
    Una obra social tiene tres clases de socios:
    Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% 
    de descuento en todos los tipos de tratamientos.
    Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
    de descuento para los mismos tratamientos que los socios del tipo A.
    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    Solicite una letra (carácter) que representa la clase de un socio,
    y luego un valor real que represente el costo del tratamiento
    (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tipo;
        int coste = 1500;
        System.out.println("Ingrese su Clase:");
        tipo = leer.next();
        switch (tipo.toUpperCase()) {
            case "A":
                System.out.println("Su tratamiento tiene un coste de: " + coste
                        + "\ny tiene un descuento de 50% por lo que debe pagar: " + (coste - (coste * 0.50)));
                break;
            case "B":
                System.out.println("Su tratamiento tiene un coste de: " + coste
                        + "\ny tiene un descuento de 35% por lo que debe pagar: " + (coste - (coste * 0.35)));
                break;
            case "C":
                System.out.println("Su tratamiento tiene un coste de: " + coste + " Ya que no tiene descuentos");
                break;
            default:
                System.out.println("Clase inexistente");
        }
    }

}
