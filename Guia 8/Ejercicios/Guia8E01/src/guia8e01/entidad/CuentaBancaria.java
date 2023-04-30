package guia8e01.entidad;

import java.util.Random;

public class CuentaBancaria {

    /*
    Realizar una clase llamada CuentaBancaria en
    el paquete Entidades con los siguientes atributos: 
    numeroCuenta(entero), dniCliente(entero largo),
    saldoActual.
    Agregar constructor vacío, con parámetros, getters y setters.
    */
    
    private String nombre;
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
        Random r = new Random();
        numeroCuenta = r.nextInt(999999999);
    }

    public CuentaBancaria(String nombre, int numeroCuenta, long dniCliente, double saldoActual) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

   
    
    
}
