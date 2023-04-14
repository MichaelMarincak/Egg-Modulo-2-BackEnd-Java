package actividades.guia.pkg3;
import java.util.Scanner;

public class EjerciciosExtra02 {

    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle
    un valor diferente a cada una. A continuación, realizar las
    instrucciones necesarias para que: B tome el valor de C, C tome
    el valor de A, A tome el valor de D y D tome el valor de B.
    Mostrar los valores iniciales y los valores finales de cada variable.
    Utilizar sólo una variable auxiliar.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 6, B = 4, C = 2, D = 8, aux;
        
        System.out.println("Las variables A, B, C y D valen: \n"
                + "A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D + "\n"
                + "\nA continuación, B toma el valor de C, C toma\n"
                + "el valor de A, A toma el valor de D y D toma el valor de B.\n");

        aux = B; B = C; C = D; D = aux; aux = A; A = C; C = aux;

        System.out.println("A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
    }

}
