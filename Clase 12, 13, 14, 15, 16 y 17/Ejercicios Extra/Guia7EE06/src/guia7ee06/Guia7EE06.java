package guia7ee06;
import guia7ee06.entidad.Rectangulo;
import java.util.Scanner;

public class Guia7EE06 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        r1.calcular_area();   
    }
}
