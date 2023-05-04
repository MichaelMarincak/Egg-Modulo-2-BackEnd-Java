package guia8e01.Servicio;

import guia8e01.entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de
    dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de
    dinero a retirar y se le restara al saldo actual.
    Si la cuenta no tiene la cantidad de dinero a 
    retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    Método extraccionRapida: le permitirá sacar solo 
    un 20% de su saldo. Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    */
    
    CuentaBancaria CB = new CuentaBancaria();
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su nombre"); CB.setNombre(leer.next());
        System.out.println("Ingrese su DNI"); CB.setDniCliente(leer.nextLong());
        System.out.println("Su numero de cuenta es: " + CB.getNumeroCuenta());
        return CB;
    }
    
    public CuentaBancaria ingresar(){
        double ingreso;
        System.out.println("Dinero que desea ingresar: "); ingreso = leer.nextDouble();
        CB.setSaldoActual(CB.getSaldoActual() + ingreso);
        return CB;
    }
    
    public CuentaBancaria retirar(){
        double retiro;
        System.out.println("Dinero que desea retirar: "); retiro = leer.nextDouble();
        if (retiro > CB.getSaldoActual()) {
            CB.setSaldoActual(CB.getSaldoActual() - retiro);
            do {                
                CB.setSaldoActual(CB.getSaldoActual() + 1);
                retiro--;
            } while (CB.getSaldoActual() != 0);
            System.out.println("Saldo insuficiente, se retiro: " + retiro);
       }else{
           CB.setSaldoActual(CB.getSaldoActual() - retiro);
            System.out.println("Se retiro " + retiro + "$ y le queda " + CB.getSaldoActual() + "$");
        } 
       return CB;
   }
   
    public CuentaBancaria extracionRapida(){
        double retiro;
        do {            
        System.out.println("Extraccio rapida, puede retirar " + (CB.getSaldoActual()*0.20)
                + "\nIngrese el monto a retirar"); retiro = leer.nextDouble();   
        } while (retiro > (CB.getSaldoActual()*0.20));
        CB.setSaldoActual(CB.getSaldoActual() - retiro);  
        
        return CB;
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: " + CB.getSaldoActual() + "$"); 
    }
    
    public void consultarDatos(){
        System.out.println("CuentaBancaria{" + "nombre=" + CB.getNombre() + ", numeroCuenta=" + CB.getNumeroCuenta() + ", dniCliente=" + CB.getDniCliente() + ", saldoActual=" + CB.getSaldoActual() + "}");
    }

}
