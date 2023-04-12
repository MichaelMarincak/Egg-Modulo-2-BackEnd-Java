package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioTeorico04 {
    
    /*
    Escriba un programa que lea 20 números. 
    Si el número leído es igual a cero se debe salir del bucle 
    y mostrar el mensaje "Se capturó el numero cero". 
    El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
    pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num,aux,suma;
         aux = 0;      
         suma = 0;
        do {            
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            }
            aux++;
            if (num == 0) {
                break;
            }
        } while (aux <20 );
        if (num == 0) {
        System.out.println("Se capturó el numero cero \n"
                + "La suma de los numeros es: " + suma);
        }else {
            System.out.println("La suma de los numeros es: " + suma);
        }
        
    }

}
