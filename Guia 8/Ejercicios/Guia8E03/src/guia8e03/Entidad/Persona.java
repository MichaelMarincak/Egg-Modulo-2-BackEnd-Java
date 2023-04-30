package guia8e03.Entidad;
public class Persona {

    /*
    Realizar una clase llamada Persona en el paquete de 
    entidades que tengan los siguientes atributos: nombre,
    edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro),
    peso y altura. Si desea añadir algún otro atributo, 
    puede hacerlo. Agregar constructores, getters y setters.
    */
    
    private String nombre;
    private int edad;
    private char sexo;
    private int peso;
    private int altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }   
}