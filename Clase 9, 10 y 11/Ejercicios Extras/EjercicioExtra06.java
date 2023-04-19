package actividades.guia.pkg5;
import java.util.Random;
import java.util.Scanner;

public class EjercicioExtra06 {

    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
    y, a medida que el usuario las va ingresando, construya una
    “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras
    se ubicarán todas en orden horizontal en una fila que será seleccionada de 
    manera aleatoria. Una vez concluida la ubicación de las palabras, rellene 
    los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
    imprima por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
    funciones de Java substring(), Length() y Math.random().
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        Random r = new Random();
        String[] palabras = new String[5];

        // Pedir al usuario que ingrese las palabras
        for (int i = 0; i < palabras.length; i++) {
            String palabra;
            do {
                System.out.printf("Ingrese la palabra %d (de 3 a 5 caracteres): ", i + 1);
                palabra = leer.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);
            palabras[i] = palabra.toUpperCase();
        }

        // Crear la sopa de letras
        char[][] sopa = new char[20][20];
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = (char) (r.nextInt(10) + '0');
            }
        }

        // Elegir una fila aleatoria para colocar las palabras
        int fila = r.nextInt(20);
        int columna = 0;

        // Colocar las palabras en la fila seleccionada
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                if (columna >= sopa[fila].length) {
                    // Si no hay espacio suficiente en la fila, seleccionar una nueva fila aleatoria
                    fila = r.nextInt(20);
                    columna = 0;
                }
                sopa[fila][columna] = palabra.charAt(j);
                columna++;
            }
            if (columna < sopa[fila].length) {
                // Agregar un espacio entre palabras si aún hay espacio disponible en la fila
                sopa[fila][columna] = ' ';
                columna++;
            } else {
                // Si no hay espacio suficiente en la fila, seleccionar una nueva fila aleatoria
                fila = r.nextInt(20);
                columna = 0;
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

