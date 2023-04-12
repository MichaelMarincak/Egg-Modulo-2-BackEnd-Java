package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioTeorico03 {
    
    /*
    Escriba un programa que valide si una nota está entre 0 y 10,
    sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        
        System.out.println("ingrese su nota");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta, ingrese su nota");
            nota = leer.nextInt();

        }
        System.out.println("Nota correcta");
    }

}
