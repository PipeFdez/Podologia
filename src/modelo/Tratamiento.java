package modelo;

public class Tratamiento {

    private String nombreTratamiento;
    private int precio;

    public Tratamiento(String nombreTratamiento, int precio) {
        this.nombreTratamiento = nombreTratamiento;
        this.precio = precio;
    }
    
    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}