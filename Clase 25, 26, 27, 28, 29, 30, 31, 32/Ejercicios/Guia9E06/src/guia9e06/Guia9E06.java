package guia9e06;
import guia9e06.Service.CursoService;
public class Guia9E06 {

    public static void main(String[] args) {
        CursoService c = new CursoService();
        
        c.crearCurso();
        System.out.printf("La ganancia semanal es: %d$ \n",c.calcularGananciaSemanal());
    }
}
