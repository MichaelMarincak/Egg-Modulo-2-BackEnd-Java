package guia7ee05;
import guia7ee05.Entidad.Empleado;
import java.util.Scanner;

public class Guia7EE05 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.baseDatos();
        e1.calcular_aumento();
    }
}
