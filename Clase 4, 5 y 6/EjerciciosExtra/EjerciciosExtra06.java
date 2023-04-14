package actividades.guia.pkg3;
import java.util.Scanner;

public class EjerciciosExtras06 {

    /*
    Leer la altura de N personas y determinar el promedio de estaturas 
    que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int estatura, promedioG, aux, aux1;
       double promedioM6;
        aux = 0; aux1 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su estatura");
            estatura = leer.nextInt();
            if (estatura < 160) {
                aux++;
            }
            aux1 = aux1 + estatura;
        }
        System.out.println(aux);    
            promedioM6 = (aux/5);
            promedioG = (aux1/5);
           System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts son: " + promedioM6
                + "\nEl promedio de estaturas en general es: " + promedioG);
    }

}
