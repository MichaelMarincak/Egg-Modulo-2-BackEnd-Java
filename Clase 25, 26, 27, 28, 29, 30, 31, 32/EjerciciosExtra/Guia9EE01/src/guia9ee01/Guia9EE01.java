package guia9ee01;
import guia9ee01.Entidad.mes;
import guia9ee01.service.mesService;
public class Guia9EE01 {

    public static void main(String[] args) {
        mesService m = new mesService();
        mes M = new mes();
        m.numeroSecreto();
        System.out.println(M.getMesSecreto());
        m.adivinarMes();
     
    }
}
