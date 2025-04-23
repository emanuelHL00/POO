package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {

    private Paciente paciente;
    private List<Consulta> listConsultas;

    public HistoriaClinica(Paciente paciente){
        this.paciente = paciente;
        this.listConsultas = new ArrayList<>();
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public List<Consulta> getListConsultas(){
        return listConsultas;
    }

    public void setListConsultas(List<Consulta> listConsultas){
        this.listConsultas = listConsultas;
    }

}
