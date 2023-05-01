package guia8ee02.Entidad;
public class NIF {

    /*
    Dígito Verificador. Crear una clase NIF que se usará
    para mantener DNIs con su correspondiente letra (NIF).
    Los atributos serán el número de DNI (entero largo) y 
    la letra (String o char) que le corresponde.
    */
    
    private long DNI;
    private String[] letra;

    public NIF() {
    }

    public NIF(long DNI, String[] letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }
}