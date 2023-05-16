package guia9ee01.Entidad;
public class mes {

    /*
    Crea una clase en Java donde declares una variable
    de tipo array de Strings que contenga los doce meses
    del año, en minúsculas. A continuación, declara una 
    variable mesSecreto de tipo String, y hazla igual a 
    un elemento del array (por ejemplo, mesSecreto = mes[9].
    El programa debe pedir al usuario que adivine el mes secreto. 
    Si el usuario acierta mostrar un mensaje, y si no lo hace, 
    pedir que vuelva a intentar adivinar el mes secreto.
    */
    
    private String[] meses;
    private String mesSecreto;

    public mes() {
        
    }

    public mes(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}