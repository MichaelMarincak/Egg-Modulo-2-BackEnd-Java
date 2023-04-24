package guia7ee06.entidad;

import java.util.Scanner;

public class Rectangulo {

    /*
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
    y un método "calcular_area" que calcule y devuelva el área del rectángulo.
    Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con 
    lados de 4 y 6 y imprime el área del rectángulo.
    */
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado: "); this.lado1 = leer.nextInt();
        System.out.println("Ingrese el valor del segundo lado: "); this.lado2 = leer.nextInt();
    }
    
    public int calcular_area(){
        int area = this.lado1 * this.lado2;
        System.out.println("El area de rectangulo es: " + area);
        return area;
    }
}
