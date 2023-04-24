package guia7e03;
import guia7e03.Entidad.Operacion;
import java.util.Scanner;

public class Guia7E03 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Operacion o1 = new Operacion();
        
        o1.crearOperacion();
        o1.sumar();
        o1.restar();
        o1.multiplicar();
        o1.dividir();
                
    }
}
