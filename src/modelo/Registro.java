package modelo;

public class Registro {
    private String codigo;
    private String fecha;
    private String hora;
    private String nombreCliente;

    public Registro(String codigo, String fecha, String hora, String nombreCliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}