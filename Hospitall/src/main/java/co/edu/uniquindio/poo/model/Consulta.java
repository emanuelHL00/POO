package co.edu.uniquindio.poo.model;

public class Consulta {
    private String fecha,sintomas,diagnostico;

    public Consulta(String fecha,String sintomas,String diagnostico){
        this.fecha = fecha;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha (String fecha){
        this.fecha = fecha;
    }

    public String getSintomas(){
        return sintomas;
    }

    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }

    public String getdiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
