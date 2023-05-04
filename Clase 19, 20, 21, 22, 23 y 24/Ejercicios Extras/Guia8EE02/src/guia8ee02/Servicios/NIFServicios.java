package guia8ee02.Servicios;

import guia8ee02.Entidad.NIF;
import java.util.Scanner;

public class NIFServicios {

    private Scanner leer = new Scanner(System.in);
    NIF n = new NIF();

    /*
     En NIFService se dispondrá de los siguientes métodos:
    Método crearNif(): le pide al usuario el DNI y 
    con ese DNI calcula la letra que le corresponderá.
    Una vez calculado, le asigna la letra que le corresponde según
    Método mostrar(): que nos permita mostrar el NIF
    (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
    
    La letra correspondiente al dígito verificador se
    calculará a traves de un método que funciona de la
    siguiente manera: Para calcular la letra se toma el
    resto de dividir el número de DNI por 23 (el resultado
    debe ser un número entre 0 y 22). El método debe buscar
    en un array (vector) de caracteres la posición que corresponda
    al resto de la división para obtener la letra correspondiente.
     */
    public void crearNif() {
        System.out.println("Ingrese su DNI");
        n.setDNI(leer.nextLong());
    }

    public void mostrar() {
        String[] letra = new String[23];
        String Letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < 23; i++) {
            letra[i] = Letra.substring(i, i + 1);
            n.setLetra(letra);
        }
        int aux = (int) (n.getDNI() % 23);
        System.out.printf("Su NIF es: %08d-%s \n", n.getDNI(), letra[aux]);

    }
}
