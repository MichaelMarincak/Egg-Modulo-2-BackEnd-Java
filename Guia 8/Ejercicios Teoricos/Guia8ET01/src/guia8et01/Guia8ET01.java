package guia8et01;
import guia8et01.Servicios.PersonaServicio;
import java.util.Scanner;

public class Guia8ET01 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        PersonaServicio P1 = new PersonaServicio();
        
        P1.crearPersona();
    }
}
