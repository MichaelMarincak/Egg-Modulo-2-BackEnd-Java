package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioExtra07 {

    /*
    Realice un programa que calcule y visualice el valor máximo,
    el valor mínimo y el promedio de n números (n>0).
    El valor de n se solicitará al principio del programa y
    los números serán introducidos por el usuario. 
    Realice dos versiones del programa,
    una usando el bucle “while” y otra con el bucle “do - while”.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numMax, numMin, suma, n, aux;
        double p;
        suma = 0; aux = 0;
        
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        numMax = n; numMin = n;
        while (n > 0) {
            numMin = Math.min(numMin, n);
            numMax = Math.max(numMax, n);
            if (n != 0) {
            suma = suma + n;
            aux++;
            }
            System.out.println("Ingrese un numero");
        n = leer.nextInt();
        }
        p = (suma / aux);

        System.out.println("El valor máximo es: " + numMax
                + "\nEl valor mínimo es: " + numMin
                + "\nEl promedio de 'N' números es: " + p + "\n");
        
        do {            
            System.out.println("Ingrese un numero");
            n = leer.nextInt();
            if (aux == 0) {
            numMax = n; numMin = n;    
            }
            numMin = Math.min(numMin, n);
            numMax = Math.max(numMax, n);
            if (n != 0) {
            suma = suma + n;
            aux++;
            }
        } while (n > 0);
        p = (suma / aux);

        System.out.println("El valor máximo es: " + numMax
                + "\nEl valor mínimo es: " + numMin
                + "\nEl promedio de 'N' números es: " + p + "\n");
        
    }

}
