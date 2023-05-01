package guia8ee01.Entidad;
public class Raices {

    /*
    Vamos a realizar una clase llamada Raices, donde 
    representaremos los valores de una ecuación de 2º grado. 
    Tendremos los 3 coeficientes como atributos, llamémosles 
    a, b y c. Hay que insertar estos 3 valores para construir 
    el objeto a través de un método constructor. 
    */
    
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}