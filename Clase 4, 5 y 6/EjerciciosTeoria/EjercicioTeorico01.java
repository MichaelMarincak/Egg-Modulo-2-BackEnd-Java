package actividades.guia.pkg3;
import java.util.Scanner;

public class EjercicioTeorico01 {

    /*Implementar un programa que le pida dos números enteros
    al usuario y determine si ambos o alguno de ellos es mayor a 25.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese un numero: ");
        
        num1 = leer.nextInt();
        
        System.out.println("Ahora, ingrese otro numero: ");
        
        num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
        System.out.println("Ambos numeros o alguno de ellos es mayor a 25.");
            
        }else {
            System.out.println("Niguno de los numeros es mayor a 25.");     
        }
    }

}
