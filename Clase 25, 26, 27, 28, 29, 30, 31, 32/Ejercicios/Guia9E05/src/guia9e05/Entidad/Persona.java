package guia9e05.Entidad;
import java.util.Date;
public class Persona {

    /*
    Implemente la clase Persona en el paquete entidades. 
    Una persona tiene un nombre y una fecha de nacimiento 
    (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
    */
    
    private String nombre;
    private Date edad;

    public Persona() {
    }

    public Persona(String nombre, Date edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }   
}