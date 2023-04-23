package guia7ee03.Entidades;

import java.util.Scanner;

public class Juego {

    /*
    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
    jugadores jugar un juego de adivinanza de números. El primer jugador elige un
    número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
    número limitado de intentos y recibe una pista de "más alto" o "más bajo" después
    de cada intento. El juego termina cuando el segundo jugador adivina el número o
    se queda sin intentos. Registra el número de intentos necesarios para adivinar el
    número y el número de veces que cada jugador ha ganado.
     */

    private int cantidadIntentos;
    private int numeroAdivinar;
    private int numeroIngresado;
    
    public Juego() {
    }

    public Juego(int cantidadIntentos, int numeroAdivinar, int numeroIngresado) {
        this.cantidadIntentos = cantidadIntentos;
        this.numeroAdivinar = numeroAdivinar;
        this.numeroIngresado = numeroIngresado;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }
    
    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in); boolean respuesta = true;
        do {            
        System.out.println("Ingrese la cantidad de intentos: "); this.cantidadIntentos = leer.nextInt();
        System.out.println("Jugador 1: Ingrese el numero a adivinar: "); this.numeroAdivinar = leer.nextInt();
            int cont = 0;
            do {                
                System.out.println("\nJugador 2: Ingrese un numero para adivinar el numero secreto");
                this.numeroIngresado = leer.nextInt();
                if (this.numeroIngresado==this.numeroAdivinar && cont < this.cantidadIntentos) {
                    System.out.println("Adivino el numero, felicidades!!");
                    break;
                }else{
                    cont++;
                    if (cont == this.cantidadIntentos) {
                        System.out.printf("Te quedan %d intentos, Perdiste :( \n", this.cantidadIntentos-cont);
                    }else{
                    if (this.numeroIngresado > this.numeroAdivinar) {
                        System.out.printf("Numero equivocado te quedan %d intentos :(\nPista: El numero es mas alto al numero secreto \n", this.cantidadIntentos-cont);
                    }else{
                        System.out.printf("Numero equivocado te quedan %d intentos :(\nPista: El numero es mas bajo al numero secreto \n", this.cantidadIntentos-cont);
                    }    
                    }
                        
                    
                }
            } while (this.numeroIngresado != this.numeroAdivinar && cont < this.cantidadIntentos);
            System.out.println("Desea seguir jugando? (S/N)"); String op = leer.next();
            if (op.equalsIgnoreCase("N")) {
                respuesta = false;
            }
        } while (respuesta);
        
    }
    
    
    
    
    
    
}
