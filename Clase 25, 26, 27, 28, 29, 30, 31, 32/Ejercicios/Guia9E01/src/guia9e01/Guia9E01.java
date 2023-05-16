package guia9e01;
import guia9e01.Servicio.CadenaServicio;
import java.util.Scanner;

public class Guia9E01 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
       CadenaServicio C = new CadenaServicio();
       
       C.llenarFrase();
       C.mostrarVocales();
       C.invertirFrase();
       C.vecesRepetido();
       C.compararLongitud();
       C.unirFrases();
       C.reemplazar();
       C.contiene(); 

    }
}
