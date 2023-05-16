package guia9ee01.service;
import guia9ee01.Entidad.mes;
import java.util.Scanner;
public class mesService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    mes m = new mes();
    
    public void numeroSecreto(){
        String[] mes = new String[12];
        mes[0]= "enero";
        mes[1]= "febrero";
        mes[2]= "marzo";
        mes[3]= "abril";
        mes[4]= "mayo";
        mes[5]= "junio";
        mes[6]= "julio";
        mes[7]= "agosto";
        mes[8]= "septiembre";
        mes[9]= "octubre";
        mes[10]= "noviembre";
        mes[11]= "diciembre";
        m.setMeses(mes);
        m.setMesSecreto(mes[(int) (Math.random() * 11 + 1)]);
    }
    
    public void adivinarMes(){
        System.out.println("Ingrese un mes para adivinar el mes secreto: ");
        String mes = leer.next();
        if (mes.toLowerCase().equalsIgnoreCase(m.getMesSecreto())) {
            System.out.println("Adivino el mes secreto!");
        }else{
            System.out.println("NO adivino el mes secreto!");
        }
    }
}
