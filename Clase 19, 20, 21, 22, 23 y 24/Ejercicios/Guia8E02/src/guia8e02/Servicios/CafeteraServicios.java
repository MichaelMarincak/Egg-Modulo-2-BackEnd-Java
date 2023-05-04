package guia8e02.Servicios;
import guia8e02.Entidad.Cafetera;
import java.util.Scanner;
public class CafeteraServicios {
    private Scanner leer = new Scanner(System.in);
    Cafetera c = new Cafetera();
    /*
    Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual
    a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, 
    el método recibe el tamaño de la taza y simula la acción de 
    servir la taza con la capacidad indicada. Si la cantidad actual
    de café “no alcanza” para llenar la taza, se sirve lo que quede.
    El método le informará al usuario si se llenó o no la taza, 
    y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café,
    el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    */
    
    public Cafetera llenarCafetera(){
        do {            
            c.setCapacidadActual(c.getCapacidadActual()+1);
        } while (c.getCapacidadMáxima() != c.getCapacidadActual());
        System.out.println("Se lleno la cafetera\n");
        return c;
    }
    
    public Cafetera servirTaza(){
        System.out.println("Ingrese el tamaño de la taza en ml");
        int taza = leer.nextInt(); int cont = 0;
        if (taza <= c.getCapacidadActual()) {
            c.setCapacidadActual(c.getCapacidadActual()-taza);
        System.out.println("Se lleno la taza\n");
        }else{
            do {   
                cont++;
                c.setCapacidadActual(c.getCapacidadActual()-1);
            } while (c.getCapacidadActual() != 0);
            System.out.println("No habia cafe suficiente y se lleno " 
                    + cont + " Ml de cafe\n");
        }
        return c;
    }
    
    public Cafetera vaciarCafetera(){
        do {   
                c.setCapacidadActual(c.getCapacidadActual()-1);
            } while (c.getCapacidadActual() != 0);
        System.out.println("Se vacio la cafetera\n");
        return c;
    }
    
    public Cafetera agregarCafe(){
         System.out.println("Ingrese la cantidad de cafe que desea agregar (en ml)");
         int aux = leer.nextInt(); int cont = 0;
         c.setCapacidadActual(c.getCapacidadActual()+ aux);
         if (c.getCapacidadActual() <= c.getCapacidadMáxima()) {
             System.out.println("Se lleno la cafetera! \n");
         }else{
             do {  
                cont++;
                c.setCapacidadActual(c.getCapacidadActual()-1); 
             } while (c.getCapacidadActual() != c.getCapacidadMáxima());
             System.out.println("Llego al limite de la cafetera, le sobro " + cont + " Ml de cafe\n");
         }
         return c;
     }
}
