package guia9e03.Servicios;

import java.util.Arrays;

public class ArregloService {

    /*
    Crear la clase ArregloService, en el paquete servicio,
    con los siguientes métodos:
    Método inicializarA recibe un arreglo por parámetro y 
    lo inicializa con números aleatorios.
    Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    Método inicializarB copia los primeros 10 números del 
    arreglo A en el arreglo B. Luego llenar las últimas 10
    posiciones del arreglo B con 0.5.
    En el Main nuevamente: inicializar A, mostrar A, ordenar
    A, inicializar B, mostrar A y B.
    */
    
    public double [] inicializarA(double[] arreglo1){
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i]= (int) (Math.random()*9+1);
        }
        return arreglo1;
    }
    
    public double [] inicializarB(double[] arreglo1, double[] arreglo2){
        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        Arrays.fill(arreglo2, 10, arreglo2.length, 0.5);
        return arreglo2;
    }
    
    public void mostrar(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    
    public double [] ordenar(double[] arreglo){
        double [] a = new double[arreglo.length];
        Arrays.sort(arreglo);
        System.arraycopy(arreglo, 0, a, 0, arreglo.length);
       return a;
    }
    
}
