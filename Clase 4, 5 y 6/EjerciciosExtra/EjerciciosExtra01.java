package actividades.guia.pkg3;
import java.util.Scanner;

public class EjerciciosExtra01 {

    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas.
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
    calcular su equivalente: 1 día, 2 horas.
    */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, hs, min;
        dia = 0;
        System.out.println("Ingrese un tiempo en minutos");
        min = leer.nextInt();
        
        hs = min / 60;
        if (hs>=24) {
            dia++;
            hs = hs - 24;
            System.out.println("Su equivalente es: " + dia + " dias, " + (hs) + " horas." );
        }else{
            System.out.println("Su equivalente en horas es de: " + hs + " horas.");
        }
            
    }

}
