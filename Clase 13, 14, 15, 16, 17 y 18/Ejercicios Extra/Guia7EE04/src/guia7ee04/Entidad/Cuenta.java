package guia7ee04.Entidad;

import java.util.Scanner;

public class Cuenta {

    /*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad
    de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
    negativo después de realizar una transacción de retiro.
    */
    
    private int saldo;
    private int titular;

    public Cuenta() {
        saldo = 1000;
    }

    public Cuenta(int saldo, int titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in); int saldoRetirar;
        System.out.println("ingrese el monto a retirar: "); saldoRetirar = leer.nextInt();
        if ((this.saldo - saldoRetirar) >= 0 ) {
            this.saldo -= saldoRetirar;
            System.out.printf("Retirando su dinero, aguarde....\nExtraccion exitosa, su saldo actual es $%d \n", this.saldo);
        }else{
            System.out.println("No cuenta con el dinero suficiente para realizar la operacion");
        }
            
    }

    
    
    
}
