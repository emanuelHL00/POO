package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private int codigo;
    private String fecha;
    private TipoConsulta tipoConsulta;
    private double costoTotal;
    private Paciente paciente;
    private PersonalApoyo personalApoyo;
    private List<Tratamiento> listTratamientos;

    public Consulta(int codigo, String fecha, TipoConsulta tipoConsulta, Paciente paciente, PersonalApoyo personalApoyo){
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.personalApoyo= personalApoyo;
        this.listTratamientos = new ArrayList<>();
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public TipoConsulta getTipoConsulta(){
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta){
        this.tipoConsulta=tipoConsulta;
    }

    public double getCostoTotal(){
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal){
        this.costoTotal=costoTotal;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public PersonalApoyo getMedicoGeneral(){
        return personalApoyo;
    }

    public void setMedicoGeneral(PersonalApoyo personalApoyo){
        this.personalApoyo=personalApoyo;
    }

    public List<Tratamiento> getListTratamientos(){
        return listTratamientos;
    }

    public void setListTratamientos(List<Tratamiento> listTratamientos){
        this.listTratamientos = listTratamientos;
    }

    public void agregarTratamiento(Tratamiento tratamiento){
        listTratamientos.add(tratamiento);
    }

    public void calcularCostoConsulta(){
        this.costoTotal = personalApoyo.calcularCosto(listTratamientos);
    }


}
