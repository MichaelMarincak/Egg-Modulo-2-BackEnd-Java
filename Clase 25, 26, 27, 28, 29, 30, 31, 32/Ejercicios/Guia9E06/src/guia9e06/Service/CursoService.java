package guia9e06.Service;
import guia9e06.Entidad.Curso;
import java.util.Scanner;
public class CursoService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c;
    /*
     A continuación, se implementarán los siguientes métodos:
    Método cargarAlumnos(): este método le permitirá al
    usuario ingresar los alumnos que asisten a las clases.
    Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada
    repetición que se ingrese el nombre de cada alumno.
    
    Método crearCurso(): el método crear curso, le pide los
    valores de los atributos al usuario y después se le asignan
    a sus respectivos atributos para llenar el objeto Curso. 
    En este método invocamos al método cargarAlumnos() para 
    asignarle valor al atributo alumnos
    
    Método calcularGananciaSemanal(): este método se encarga 
    de calcular la ganancia en una semana por curso. Para ello,
    se deben multiplicar la cantidad de horas por día, el precio
    por hora, la cantidad de alumnos y la cantidad de días a la 
    semana que se repite el encuentro.
    */
    
    public String[] cargarAlumnos(){
        String[] nombre = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los nombres de sus alumnos: "); nombre[i] = leer.next();     
        }
       return nombre; 
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombrec = leer.next();
        System.out.println("Ingrese el turno del curso");
        String turno = leer.next();
        System.out.println("Ingrese la catidad de dias a la semana del curso");
        int CantidadD = leer.nextInt();
        System.out.println("Ingrese la catidad de horas a la semana del curso");
        int CantidadH = leer.nextInt();
        System.out.println("Ingrese el precio por horas del curso");
        int precioH = leer.nextInt();
        return c = new Curso(nombrec, CantidadH, CantidadD, turno, precioH, cargarAlumnos());
    }
    
    public int calcularGananciaSemanal(){
      return (c.getCantidadHorasPorDia()*c.getPrecioPorHora()*5*c.getCantidadDiasPorSemana());  
    }
}
