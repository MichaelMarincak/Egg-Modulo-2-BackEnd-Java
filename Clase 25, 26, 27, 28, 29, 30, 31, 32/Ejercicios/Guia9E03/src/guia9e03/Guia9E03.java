package guia9e03;
import guia9e03.Servicios.ArregloService;
import java.util.Scanner;
public class Guia9E03 {
    static Scanner leer = new Scanner(System.in);
        
    /*
    Crear en el Main dos arreglos. El arreglo A de 50 números reales
    y el arreglo B de 20 números reales
    */

    public static void main(String[] args) {
        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];
        ArregloService a = new ArregloService();
        
        a.inicializarA(arreglo1);
        a.mostrar(arreglo1);
        a.ordenar(arreglo1);
        a.inicializarB(arreglo1, arreglo2);
        a.mostrar(arreglo1);
        a.mostrar(arreglo2);
        //En el Main nuevamente: inicializar A, mostrar A, ordenar A,
        //inicializar B, mostrar A y B.
        
        
        
        
    }
}
