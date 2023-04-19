package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioTeorico01y02 {

    /*
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad 
    de compañeros de equipo y define su tipo de dato de tal manera 
    que te permita alojar sus nombres más adelante.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String [5]; 
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su nombre");
            Equipo [i] = leer.next(); 
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + Equipo[i] + "]");
        }
    }

}
