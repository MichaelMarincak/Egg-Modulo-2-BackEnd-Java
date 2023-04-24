package EjercicioTeorico;
import Entidad.Persona;
import java.util.Scanner;


public class EjercioTeorico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona("Michael", 18, 95.5);
        p1.caminar(100);
        
//        System.out.println("Ingrese su nombre");
//        
//        System.out.println("Ingrese su edad");
//        p1.edad = leer.nextInt();
//        
//        System.out.println("Ingrese su peso");
//        p1.peso = leer.nextInt(); 
        
        System.out.println(p1.toString());
    }
}
