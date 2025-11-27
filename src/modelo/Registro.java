package modelo;

public class Registro {
    private String codigo;
    private String fecha;
    private String hora;
    private String nombre;
    private String apellido;
    private int edad;

    public Registro(String codigo, String fecha, String hora, String nombre, String apellido, int edad) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Registro() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
}