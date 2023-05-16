package guia9e01.Servicio;
import guia9e01.Entidad.Cadena;
import java.util.Scanner;
public class CadenaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c;
    /*
    Crear una clase CadenaServicio en el paquete servicios que
    implemente los siguientes métodos:
    Método mostrarVocales(), deberá contabilizar la cantidad de
    vocales que tiene la frase ingresada.
    Método invertirFrase(), deberá invertir la frase ingresada y 
    mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
    Salida: "acnalb asac".
    Método vecesRepetido(String letra), recibirá un carácter 
    ingresado por el usuario y contabilizar cuántas veces se 
    repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    Método compararLongitud(String frase), deberá comparar la 
    longitud de la frase que compone la clase con otra nueva 
    frase ingresada por el usuario.
    Método unirFrases(String frase), deberá unir la frase contenida
    en la clase Cadena con una nueva frase ingresada por el usuario
    y mostrar la frase resultante.
    Método reemplazar(String letra), deberá reemplazar todas las 
    letras “a” que se encuentren en la frase, por algún otro carácter
    seleccionado por el usuario y mostrar la frase resultante.
    Método contiene(String letra), deberá comprobar si la frase 
    contiene una letra que ingresa el usuario y devuelve verdadero
    si la contiene y falso si no.
    */
    
    public void llenarFrase(){
        String p;
        System.out.println("Ingrese una frase");
        p= leer.next();
        c = new Cadena(p);
    }
    
    public Cadena mostrarVocales(){
        int aux = 0;
        for (int i = 0; i < c.getLon(); i++) {
            switch (c.getFrase().toLowerCase().substring(i, i+1)) {
                case "a": case "e": case "i": case "o": case "u":  
                    aux++; break;}
        }
        System.out.printf("La frase tiene %d vocales \n", aux);
        return c;
    }
    
    public void invertirFrase(){
        System.out.println("");
        for (int i = c.getLon(); i > 0; i--) {
            System.out.print(c.getFrase().substring(i-1, i));
        }
        System.out.println("");
    }
    
    public void vecesRepetido(){
        String palabra; int aux = 0;
        System.out.println("Ingrese una letra a buscar"); palabra = leer.next();
        for (int i = 0; i < c.getLon(); i++) {
            if (c.getFrase().substring(i, i+1).toLowerCase().equalsIgnoreCase(palabra)) {
                aux++;
            }
        }
        System.out.printf("El caracter '%s' se repite %d veces \n", palabra, aux);
    }
    
    public int compararLongitud(){
        String frase;
        System.out.println("Ingrese una frase"); frase = leer.next();
        return c.getFrase().compareTo(frase);
    }
    
    public void unirFrases(){
        String frase;
        System.out.println("Ingrese una frase"); frase = leer.next();
        System.out.println(c.getFrase().concat(frase));
    }
    
    public void reemplazar(){
        String frase;
        System.out.println("Ingrese un caracter"); frase = leer.next();
        System.out.println(c.getFrase().toLowerCase().replace("a", frase));
    }
    
    public void contiene(){
        String frase; boolean aux = false;
        System.out.println("Ingrese un caracter"); frase = leer.next(); frase.toLowerCase();
        for (int i = 0; i < c.getLon(); i++) {
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase(frase)) {
                aux = true; System.out.println(aux); break;
            }
        }
        if (!aux) {
            System.out.println(aux);
        }
    }
}
