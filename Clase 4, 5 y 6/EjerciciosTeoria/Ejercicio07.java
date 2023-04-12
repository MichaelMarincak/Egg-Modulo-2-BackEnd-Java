package actividades.guia.pkg3;
import java.util.Scanner;

public class Ejercicio07 {

    /*
    Realizar un programa que simule el funcionamiento de un dispositivo RS232,
    este tipo de dispositivo lee cadenas enviadas por el usuario. 
    Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
    de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
    tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, 
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
    y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
    correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
    cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE;
        int sumaV, sumaF;
        sumaV = 0;
        sumaF = 0;
        do {
            do {
                System.out.println("Ingrese la cadena");
                FDE = leer.next();
            } while (FDE.length() != 5);

            if (FDE.substring(4, 5).equalsIgnoreCase("O") && FDE.substring(0, 1).equalsIgnoreCase("X")) {
                sumaV = sumaV + 1;
            } else if (!FDE.substring(4, 5).equalsIgnoreCase("O") && !FDE.substring(0, 1).equalsIgnoreCase("X") && !FDE.equalsIgnoreCase("&&&&&")) {
                sumaF = sumaF + 1;
            }

        } while (!FDE.equalsIgnoreCase("&&&&&"));

        System.out.println("INFORME:\n"
                + "Cantidad de veces correctas: " + sumaV + "\n"
                + "Cantidad de veces incorrectas: " + sumaF);
    }

}
