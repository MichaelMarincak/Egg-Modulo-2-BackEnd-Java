package actividades.guia.pkg5;
import java.util.Scanner;

public class EjercicioExtra04 {

    /*
    Los profesores del curso de programación de Egg necesitan llevar un registro 
    de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
    aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
    notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
    de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
    Al final del programa los profesores necesitan obtener por pantalla la cantidad 
    de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
    promedio mayor o igual al 7 de sus notas del curso.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] notas = new double[10]; double tp1, tp2, tpi1, tpi2, promedio; int auxA = 0, auxD = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo"); tp1 = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo"); tp2 = leer.nextDouble();
            System.out.println("Ingrese la nota del primer integrador"); tpi1 = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador\n"); tpi2 = leer.nextDouble();
            promedio = (tp1 * 0.10) + (tp2 * 0.15) + (tpi1 * 0.25) + (tpi2 * 0.50);
            notas[i] = promedio;
            if (notas[i] >= 7) {auxA++;}else{auxD++;}
        }
        System.out.println("\nLa cantidad de alumnos aprobados es: " + auxA
                + "\nLa cantidad de alumnos desaprobados es: " + auxD);
    }
}
