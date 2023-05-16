package guia9e01.Entidad;
public class Cadena {

    /*
    Realizar una clase llamada Cadena, en el paquete de entidades,
    que tenga como atributos una frase (String) y su longitud.
    Agregar constructor vacío y con atributo frase solamente.
    Agregar getters y setters. El constructor con frase como 
    atributo debe setear la longitud de la frase de manera automática. 
    */
    
    private String frase;
    private int lon;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.lon = this.frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}