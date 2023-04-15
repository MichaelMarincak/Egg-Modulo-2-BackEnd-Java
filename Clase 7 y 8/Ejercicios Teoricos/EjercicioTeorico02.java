package actividades.guia.pkg4;
import java.util.Scanner;

public class EjercicioTeorico02 {

    /*
    Crea un procedimiento EsMultiplo que reciba los dos números 
    pasados por el usuario, validando que el primer número múltiplo
    del segundo e imprima si el primer número es múltiplo del segundo,
    sino informe que no lo son.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros para saber si son multiplo: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        Esmultiplo(num1, num2);
    }
    
    public static void Esmultiplo(int num1, int num2){
        if (num2 % num1 == 0) {
            System.out.println("El primer número es múltiplo del segundo");
        }else{
            System.out.println("El primer número 'NO' es múltiplo del segundo");
        }
        
    }
    
}
