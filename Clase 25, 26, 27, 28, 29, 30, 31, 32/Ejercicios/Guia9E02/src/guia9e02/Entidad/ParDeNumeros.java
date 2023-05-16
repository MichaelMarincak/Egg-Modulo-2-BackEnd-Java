package guia9e02.Entidad;
public class ParDeNumeros {

    /*
    Realizar una clase llamada ParDeNumeros que 
    tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones
    matemáticas. La clase debe tener un constructor 
    vacío, getters y setters.  En el constructor 
    vacío se usará el Math.random para generar los
    dos números
    */
    
    private double num1;
    private double num2;

    public ParDeNumeros() {
        num1 = (int) (Math.random()*9+1);
        num2 = (int) (Math.random()*9+1);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
}
    
