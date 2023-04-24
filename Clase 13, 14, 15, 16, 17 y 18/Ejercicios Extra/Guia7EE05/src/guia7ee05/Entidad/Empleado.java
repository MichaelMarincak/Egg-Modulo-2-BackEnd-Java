package guia7ee05.Entidad;

import java.io.PrintStream;
import java.util.Scanner;

public class Empleado {

    /*
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
    empleado en función de su edad y salario actual. El aumento salarial debe ser 
    del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
    */
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void baseDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: "); this.nombre = leer.next(); 
        System.out.println("Ingrese su edad: "); this.edad = leer.nextInt();
        System.out.println("Ingrese su salario: "); this.salario = leer.nextDouble();
    }
    
    public void calcular_aumento(){
        if (this.edad > 30) {
            this.salario = (int) ((this.salario) + this.salario*0.10); 
            System.out.format("Felicidades %s, tiene un aumento del 10 porciento y empezara a ganar %.2f \n", this.nombre,this.salario);
        }else{
            this.salario += (this.salario*0.05); 
            System.out.printf("Felicidades %s, tiene un aumento del 5 porciento y empezara a ganar %.2f \n", this.nombre ,this.salario);
        }
    }
}
