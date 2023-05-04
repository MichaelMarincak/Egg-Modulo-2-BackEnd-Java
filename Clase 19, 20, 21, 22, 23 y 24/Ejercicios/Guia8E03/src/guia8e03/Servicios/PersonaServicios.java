package guia8e03.Servicios;
import guia8e03.Entidad.Persona;
import java.util.Scanner;
public class PersonaServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");  
    Persona persona = new Persona();
    /*
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los
    atributos al usuario y después se le asignan a sus respectivos atributos
    para llenar el objeto Persona. Además, comprueba que el sexo introducido
    sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    Método calcularIMC(): calculara si la persona está en su peso ideal 
    (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
    valor menor que 20, significa que la persona está por debajo de su
    peso ideal y la función devuelve un -1. Si la fórmula da por resultado
    un número entre 20 y 25 (incluidos), significa que la persona está en
    su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    de la fórmula es un valor mayor que 25 significa que la persona tiene 
    sobrepeso, y la función devuelve un 1.
    */
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre"); persona.setNombre(leer.next());
        System.out.println("Ingrese su edad"); persona.setEdad(leer.nextInt());
         System.out.println("Ingrese el sexo (H/M/O):");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido, ingrese nuevamente:");
            sexo = leer.next().toUpperCase().charAt(0);}
        persona.setSexo(sexo);
        System.out.println("Ingrese su peso"); persona.setPeso(leer.nextInt());
        System.out.println("Ingrese su altura en cm"); persona.setAltura(leer.nextInt());
        return persona;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        return (persona.getEdad() >= 18);
    }
    
    public int calcularIMC(Persona persona){
        int imc;
        if ((persona.getPeso() / (int) (Math.pow(persona.getAltura()/100, 2))) <20) {
            System.out.println("Está por debajo de su peso ideal\n"); imc = -1;
        }else if ((persona.getPeso() / (int) (Math.pow(persona.getAltura()/100, 2))) >=20 && (persona.getPeso() / (int) (Math.pow(persona.getAltura()/100, 2))) <= 25){
            System.out.println("Está en su peso ideal\n"); imc = 0;
        }else{
            System.out.println("tiene sobrepeso\n"); imc = 1;
        }
        return imc;
    }
}
