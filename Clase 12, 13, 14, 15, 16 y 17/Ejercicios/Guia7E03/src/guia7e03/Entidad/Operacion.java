package guia7e03.Entidad;
import java.util.Scanner;

public class Operacion {
    /**
     * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
     * A continuación, se deben crear los siguientes métodos:
     * Método constructor sin los atributospasados por parámetro.
     * Métodos get y set.
     * Método para crearOperacion(): que le pide al usuario los dos números y 
     * los guarda en los atributos del objeto.
     * Método sumar(): calcular la suma de los números y devolver el resultado al main. 
     * Método restar(): calcular la resta de los números y devolver el resultado al main
     * Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
     * si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
     * Si no, se hace la multiplicación y se devuelve el resultado al main 
     * Método dividir(): primero valida que no se haga una división por cero, 
     * si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
     * error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    private int num1;
    private int num2;

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: "); 
        setNum1(leer.nextInt());
        setNum2(leer.nextInt());
    }
    
    public int sumar(){
        int suma = this.num1 + this.num2;
        System.out.println("La suma de los dos valores es: " + suma);
        return suma;
    }
    
    public int restar(){
        int resta = this.num1 - this.num2;
        System.out.println("La resta de los dos valores es: " + resta);
        return resta;
    }
    
    public int multiplicar(){
        int mul = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("Uno de los dos valores es 0 por lo que el resultado es: 0");
        }else{
        mul = this.num1 * this.num2;
        System.out.println("La multiplicacion de los dos valores es: " + mul);
        }
        return mul;
    }
    
     public double dividir(){
        double div = 0; double num1 = this.num1; double num2 = this.num2;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("Uno de los dos valores es 0, SintaxError");
        }else{
        div = num1 / num2;
        System.out.printf("La divicion de los dos valores es: %.2f \n", div);
        }
        return div;
    }
}
