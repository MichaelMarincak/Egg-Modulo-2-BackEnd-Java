package guia8et01.Entidad;
public class Persona {

    /*
    Crea un método void que reciba un objeto tipo 
    persona como parámetro y utilice el get para 
    mostrar sus atributos. Llama ese método desde el main.
    */
    
    private String Nombre;

    public Persona() {
    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
