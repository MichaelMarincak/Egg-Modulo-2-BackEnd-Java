package guia7e04.Entidad;
import java.util.Scanner;

public class Rectangulo {
    
    /**
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
     * privado base y un atributo privado altura. 
     * La clase incluirá un método para crear el rectángulo con los datos del 
     * Rectángulo dados por el usuario. 
     * También incluirá un método para calcular la superficie del rectángulo y 
     * un método para calcular el perímetro del rectángulo.
     * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando 
     * la base y la altura. Se deberán además definir los métodos getters, setters y 
     * constructores correspondientes.
       Superficie = base * altura / Perímetro = (base + altura) * 2.
     */

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectángulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: "); this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: "); this.altura = leer.nextInt();
    }
    
    public void superficie(){
        int Superficie = this.base * this.altura;
        System.out.println("La superficie es: "+ Superficie);
    }
    
    public void perimetro(){
        int Perimetro = (this.base + this.altura) * 2;
        System.out.println("El perimetro es: "+ Perimetro);
    }
    
    public void dibujar(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura-1 || j == 0 || j == this.base-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
