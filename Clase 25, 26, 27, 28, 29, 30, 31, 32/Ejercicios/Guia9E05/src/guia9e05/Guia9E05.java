package guia9e05;
import guia9e05.Servicio.PersonaService;
import java.util.Scanner;
public class Guia9E05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService p = new PersonaService();
        
        p.crearPersona();
        System.out.println("Ingrese una edad a comparar: "); int edad = leer.nextInt();
        System.out.println("El usuario es menor que la edad ingresada? " + p.menorQue(edad));
        p.mostrarPersona();
    }
}
