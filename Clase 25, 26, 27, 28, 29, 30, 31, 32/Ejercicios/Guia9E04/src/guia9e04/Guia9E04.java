package guia9e04;
import guia9e04.Servicio.DateService;
import java.util.Date;
public class Guia9E04 {

    public static void main(String[] args) {
       DateService D = new DateService();
        Date fechaNacimiento = D.fechaNacimiento();

        // Obtener la fecha actual
        Date fechaActual =D.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = D.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }
}
