package guia8e01;

import guia8e01.Servicio.CuentaBancariaServicios;

public class Guia8E01 {
    
    public static void main(String[] args) {
        CuentaBancariaServicios cb = new CuentaBancariaServicios();
        
        cb.crearCuenta();
        cb.ingresar();
        cb.retirar();
        cb.ingresar();
        cb.extracionRapida();
        cb.consultarSaldo();
        cb.consultarDatos();
               
    }
}
