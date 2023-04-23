package guia7ee02;
import guia7ee02.Entidad.Puntos;
import java.util.Scanner;

public class Guia7EE02 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        p1.calcularDistancia();
    }
}
