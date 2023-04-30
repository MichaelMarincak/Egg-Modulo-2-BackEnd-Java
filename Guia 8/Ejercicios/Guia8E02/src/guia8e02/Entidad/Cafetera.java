package guia8e02.Entidad;
public class Cafetera {

    /*
    Programa Nespresso. Desarrolle una clase Cafetera
    en el paquete Entidades con los atributos capacidadMáxima
    (la cantidad máxima de café que puede contener la cafetera)
    y cantidadActual (la cantidad actual de café que hay en la cafetera).
    Agregar constructor vacío y con parámetros así como setters y getters.
    Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    */
    
    private int capacidadMáxima;
    private int capacidadActual;

    public Cafetera() {
        capacidadMáxima = 2000;
        capacidadActual = 0;
    }

    public Cafetera(int capacidadMáxima, int capacidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
}
