package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private String nombre;
    private List<MedicoGeneral> listMedicoGenerales;
    private List<Cirujano> listCirujanos;
    private List<Especialista> listEspecialistas;
    private List<Paciente> listPacientes;

    public Clinica(String nombre){
        this.nombre=nombre;
        this.listMedicoGenerales = new ArrayList<>();
        this.listCirujanos = new ArrayList<>();
        this.listEspecialistas = new ArrayList<>();
        this.listPacientes = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public List<MedicoGeneral> getListMedicoGenerales(){
        return listMedicoGenerales;
    }

    public void setListMedicoGenerales(List<MedicoGeneral> listMedicoGenerales){
        this.listMedicoGenerales = listMedicoGenerales;
    }

    public List<Cirujano> getListCirujanos() {
        return listCirujanos;
    }

    public void setListCirujanos(List<Cirujano> listCirujanos) {
        this.listCirujanos = listCirujanos;
    }

    public List<Especialista> getListEspecialistas(){
        return listEspecialistas;
    }

    public void setListEspecialistas(List<Especialista> listEspecialistas){
        this.listEspecialistas = listEspecialistas;
    }

    public List<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(List<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }
}
