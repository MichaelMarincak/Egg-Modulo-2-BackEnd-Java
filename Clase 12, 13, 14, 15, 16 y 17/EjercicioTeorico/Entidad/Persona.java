package Entidad;


public class Persona {
        private String Nombre;
        private int Edad;
        private double Peso;
        private int energia;

    public Persona() {
        energia = 1000;
    }

    public Persona(String Nombre, int Edad, double Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        energia = 1000;
    }


    public static void main(String[] args) {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public int caminar(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", energia=" + energia + '}';
    }

    
    
   
}

    
