package guia9e02;
import guia9e02.Servicio.ParDeNumerosServicio;
import java.util.Scanner;

public class Guia9E02 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ParDeNumerosServicio P = new ParDeNumerosServicio();
        P.mostrarValores();
        System.out.println(P.devolverMayor());
        P.calcularPotencia();
        P.calculaRaiz();
    }
}
