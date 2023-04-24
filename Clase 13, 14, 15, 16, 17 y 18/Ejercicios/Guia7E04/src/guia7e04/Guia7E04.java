package guia7e04;
import guia7e04.Entidad.Rectangulo;
import java.util.Scanner;

public class Guia7E04 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.crearRectángulo();
        r1.superficie();
        r1.perimetro();
        r1.dibujar();
    }
}
