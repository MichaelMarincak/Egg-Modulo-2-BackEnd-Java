package guia9e06.Entidad;
public class Curso {

    /*
    Un profesor particular está dando cursos para grupos
    de cinco alumnos y necesita un programa para organizar
    la información de cada curso. Para ello, crearemos una
    clase entidad llamada Curso, cuyos atributos serán: 
    nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, 
    turno (mañana o tarde),  precioPorHora y alumnos. 
    Donde alumnos es un arreglo de tipo String de dimensión 
    5 (cinco), donde se alojarán los nombres de cada alumno.
    Un constructor por defecto.
    Un constructor con todos los atributos como parámetro.
    Métodos getters y setters de cada atributo.
    */
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }         
}