package guia8e03;
import guia8e03.Entidad.Persona;
import guia8e03.Servicios.PersonaServicios;
public class Guia8E03 {

    public static void main(String[] args) {
        PersonaServicios personaServicio = new PersonaServicios();
        Persona[] personas = new Persona[4];

        int[] resultadosIMC = new int[4];
        boolean[] mayoresDeEdad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            personas[i] = personaServicio.crearPersona();
            resultadosIMC[i] = personaServicio.calcularIMC(personas[i]);
            mayoresDeEdad[i] = personaServicio.esMayorDeEdad(personas[i]);
        }
        int auxbp = 0; int auxpn = 0; int auxpa = 0; int auxmax = 0; int auxmin = 0;
        for (int i = 0; i < 4; i++) {
            switch (resultadosIMC[i]) {
                case -1:auxbp++;break;
                case 0:auxpn++;break;
                case 1:auxpa++;break;}
            if (mayoresDeEdad[i]) {
                auxmax++;
            }
        }
        System.out.printf("Porcentaje de personas por debajo del peso ideal: %.2f\n", (auxbp / 4.0) * 100);
        System.out.printf("Porcentaje de personas en su peso ideal: %.2f\n", (auxpn / 4.0) * 100);
        System.out.printf("Porcentaje de personas con sobrepeso: %.2f\n", (auxpa / 4.0) * 100);
        System.out.printf("Porcentaje de personas mayores de edad: %.2f\n", (auxmax / 4.0) * 100);
        System.out.printf("Porcentaje de personas menores de edad: %.2f\n", ((4 - auxmax) / 4.0) * 100);
    }
}