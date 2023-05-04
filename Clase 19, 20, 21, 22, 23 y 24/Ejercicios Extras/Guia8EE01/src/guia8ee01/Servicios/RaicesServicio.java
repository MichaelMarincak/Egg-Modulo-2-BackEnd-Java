package guia8ee01.Servicios;
import guia8ee01.Entidad.Raices;
import java.util.Scanner;
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    Raices r = new Raices();
    /*
    Luego, en RaicesServicio las operaciones que se podrán
    realizar son las siguientes:
    Método getDiscriminante(): devuelve el valor del discriminante
    (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    Método tieneRaices(): devuelve un booleano indicando si tiene 
    dos soluciones, para que esto ocurra, el discriminante debe
    ser mayor o igual que 0.
    Método tieneRaiz(): devuelve un booleano indicando si tiene
    una única solución, para que esto ocurra, el discriminante 
    debe ser igual que 0.
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true,
    imprime las 2 posibles soluciones.
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true 
    imprime una única raíz. Es en el caso en que se tenga una única 
    solución posible.
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz()
    , y mostrará por pantalla las posibles soluciones que tiene nuestra
    ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    que devuelvan nuestros métodos y en caso de no existir solución,
    se mostrará un mensaje.
    Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
    Solo varía el signo delante de -b
    */
    
    public Raices raiz(){
        System.out.println("Ingrese el valor de 'A' "); r.setA(leer.nextInt());
        System.out.println("Ingrese el valor de 'B' "); r.setB(leer.nextInt());
        System.out.println("Ingrese el valor de 'C' "); r.setC(leer.nextInt());
        return r;
    }
    
    public double getDiscriminante(){
        double dis = (Math.pow(r.getB(), 2)) - 4 * r.getA() * r.getC();
        return dis;
    }
    
    public boolean tieneRaices(){
        return (getDiscriminante() >0);
    }
    
    public boolean tieneRaiz(){
        return (getDiscriminante() ==0);
    }
    
    public void obtenerRaices(){
        if (tieneRaices()) {
            System.out.println("X1 = " + ((-r.getB() + Math.sqrt(getDiscriminante()))) / (2 * r.getA())
                    + " X2 = " + ((-r.getB() - Math.sqrt(getDiscriminante())) / (2 * r.getA())));
        } 
    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            System.out.println("X1, X2 = " + ((-r.getB() + Math.sqrt(getDiscriminante()))) / (2 * r.getA()));
        }
    }
    
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if (tieneRaiz()){
           obtenerRaiz(); 
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
