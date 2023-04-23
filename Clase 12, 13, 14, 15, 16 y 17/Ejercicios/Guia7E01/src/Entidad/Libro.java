package Entidad;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String NumPagina;

    public Libro(String ISBN, String Titulo, String Autor, String NumPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPagina = NumPagina;
    }

    public Libro() {
    }
    public static void main(String[] args) {
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getNumPagina() {
        return NumPagina;
    }

    public void setNumPagina(String NumPagina) {
        this.NumPagina = NumPagina;
    }

    public void cargarLibro (){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de ISBN: ");
        ISBN = leer.next();
        System.out.println("Ingrese el título del libro: ");
        Titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        Autor = leer.next();
        System.out.println("Ingrese el número de páginas del libro: ");
        NumPagina = leer.next();
    }

    public void mostrarlibro(){
        System.out.println  ("ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPagina=" + NumPagina );
    } 
}
