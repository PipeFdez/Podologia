package modelo;

public class RegistroTratamiento {
    
    private String codigo;
    private String idTratamiento;

    public RegistroTratamiento(String codigo, String idTratamiento) {
        this.codigo = codigo;
        this.idTratamiento = idTratamiento;
    }

    public RegistroTratamiento() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(String idTratamiento) {
        this.idTratamiento = idTratamiento;
    }
}
