package guia9e02.Servicio;
import guia9e02.Entidad.ParDeNumeros;
public class ParDeNumerosServicio {
    ParDeNumeros p = new ParDeNumeros();
    /*
    Crear una clase ParDeNumerosService, en
    el paquete Servicios, que deberá además
    implementar los siguientes métodos:
    Método mostrarValores que muestra cuáles
    son los dos números guardados.
    Método devolverMayor para retornar cuál
    de los dos atributos tiene el mayor valor
    Método calcularPotencia para calcular la 
    potencia del mayor valor de la clase 
    elevado al menor número. Previamente
    se deben redondear ambos valores.
    Método calculaRaiz, para calcular la
    raíz cuadrada del menor de los dos 
    valores. Antes de calcular la raíz
    cuadrada se debe obtener el valor
    absoluto del número.
    */
    
    public void mostrarValores(){
        System.out.println("El Primer numero es: " + p.getNum1() 
                    + "\nEl segundo numero es: " + p.getNum2());
    }
    
    public double devolverMayor(){
        return Math.max(p.getNum1(), p.getNum2());
    }
    
    public void calcularPotencia(){
   
        System.out.println(((int) Math.pow(devolverMayor(), Math.min(p.getNum1(), p.getNum2())))); 
    }
    
    public void calculaRaiz(){
        System.out.println(((int) Math.sqrt(Math.min(p.getNum1(), p.getNum2()))));
    }
}
