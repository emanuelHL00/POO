package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {
    private Especialidades especialidad;
    private Departamento departamento;
    private List<Paciente> listPacientes;

    public Medico(String nombre, int ID, String telefono, Especialidades especialidad, Departamento departamento) {
        super(nombre, ID, telefono);
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.listPacientes = new ArrayList<>();
    }

    public Especialidades getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad){
        this.especialidad = especialidad;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento (Departamento departamento){
        this.departamento = departamento;
    }

    public List<Paciente> getListPacientes(){
        return listPacientes;
    }

    public void setListPacientes(List<Paciente> listPacientes){
        this.listPacientes = listPacientes;
    }

    public void agregarPaciente (Paciente paciente){
        listPacientes.add(paciente);
    }

    public int contadorPacientes(){
        int contador = 0;
        for(Paciente paciente : listPacientes) {
            contador++;
        }
        return contador;
    }


}
