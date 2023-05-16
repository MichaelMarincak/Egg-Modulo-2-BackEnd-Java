package guia9e05.Servicio;
import guia9e05.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;
public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona P;
    /*
    Crear una clase PersonaService, en el paquete servicio,
    con los siguientes métodos:
    Método crearPersona que pida al usuario Nombre y fecha
    de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    Método calcularEdad que calcule la edad del usuario 
    utilizando el atributo de fecha de nacimiento y la fecha actual.
    Método menorQue recibe como parámetro una Persona y 
    una edad. Retorna true si la persona es menor que la 
    edad consultada o false en caso contrario.
    Método mostrarPersona que muestra la información de la persona deseada.
    */
    public Date leerFechaNacimiento() {
        System.out.println("Por favor, ingrese el día de su nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de su nacimiento (1-12):");
        int mes = leer.nextInt() - 1;
        System.out.println("Por favor, ingrese el año de su nacimiento:");
        int anio = leer.nextInt() - 1900;

        return new Date(anio, mes, dia);
    }
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona"); String nombre = leer.next();
        Date fecha = leerFechaNacimiento();
        
        return P = new Persona(nombre, fecha);
    }
    
    public Date fechaActual() {
        return new Date();
    }
    
    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }
    
    public boolean menorQue(int edad) {
        return calcularEdad(P.getEdad(),fechaActual()) < edad;
    }
    
     public void mostrarPersona(){
         System.out.println("Nombre de la persona: " + P.getNombre() + "\n"
                 + "Tiene " + P.getEdad() + " años");
     }
     
     
}
