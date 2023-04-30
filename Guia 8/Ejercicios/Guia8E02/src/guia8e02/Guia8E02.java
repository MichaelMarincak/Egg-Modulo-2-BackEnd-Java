package guia8e02;
import guia8e02.Servicios.CafeteraServicios;
public class Guia8E02 {
   
    public static void main(String[] args) {
        CafeteraServicios C = new CafeteraServicios();
        
        C.llenarCafetera();
        C.servirTaza();
        C.vaciarCafetera();
        C.agregarCafe();
    }
}
