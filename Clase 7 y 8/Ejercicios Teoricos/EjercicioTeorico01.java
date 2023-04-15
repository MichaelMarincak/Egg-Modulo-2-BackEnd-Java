package actividades.guia.pkg4;
import java.util.Scanner;

public class EjercicioTeorico01 {

    /*
    Escribir un programa que procese una secuencia de caracteres
    ingresada por teclado y terminada en punto, y luego codifique
    la palabra o frase ingresada de la siguiente manera: cada vocal
    se reemplaza por el carácter que se indica en la tabla y el resto
    de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    a e i o u
    @ # $ % *
    Realice un subprograma que reciba una secuencia de caracteres
    y retorne la codificación correspondiente. Utilice la estructura
    “según” para la transformación. 
    Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();

        System.out.println("Su frase es: '" + frase + "'\n"
                + "Su nueva frase es: '" + codificador(frase) + "'");
    }
    
    public static String codificador(String frase) {
        String devuelve;
        devuelve = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i+1).toUpperCase()) {
                case "A":
                    devuelve = devuelve.concat("@");
                    break;
                case "E":
                    devuelve = devuelve.concat("#");
                    break;
                case "I":
                    devuelve = devuelve.concat("$");
                    break;
                case "O":
                    devuelve = devuelve.concat("%");
                    break;
                case "U":
                    devuelve = devuelve.concat("*");
                    break;
                default:
                    devuelve = devuelve.concat(frase.substring(i, i+1));
            }
        }
        return devuelve;

    }

}
