package guia8et01.Servicios;

import guia8et01.Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
        private Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        Persona p1 = new Persona();
        
        System.out.println("Ingrese un El nombre de la persona");
        p1.setNombre(leer.next());
        
        System.out.println(p1.getNombre());
        return p1;
    }
}
