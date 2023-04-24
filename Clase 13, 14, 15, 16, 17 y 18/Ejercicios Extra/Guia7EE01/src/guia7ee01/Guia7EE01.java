package guia7ee01;
import guia7ee01.Entidad.Cancion;
import java.util.Scanner;

public class Guia7EE01 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Merry Christmas Baby", "Elvis Presley");

        c1.setAutor("Arjona");
        c1.setTitulo("Señora de 4 decadas");
        System.out.println("El nombre de la primer canción es " + c1.getTitulo() + " y su autor es " + c1.getAutor());
        System.out.println("El nombre de la primer canción es " + c2.getTitulo() + " y su autor es " + c2.getAutor());
    }
}
