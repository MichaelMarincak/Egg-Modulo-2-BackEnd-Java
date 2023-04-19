package actividades.guia.pkg5;

public class Ejercicio01 {

    /*
    Realizar un algoritmo que llene un vector con los 100 primeros
    números enteros y los muestre por pantalla en orden descendente.
    */
    public static void main(String[] args) {
        int [] numeros = new int [100];
        for (int i = 0; i <= 99; i++) {
            numeros [i] = (i+1);
        }
        for (int i = 99; i >= 0; i--) {
            if (i%3==0) {
            System.out.println("[" + numeros[i] + "]");
                
            }else{
                 System.out.print("[" + numeros[i] + "]");
            }
        }
    }

}
