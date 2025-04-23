package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre, direccion;
    private List<Medico> listMedicos;
    private List<Administrativo> listAdministrativos;
    private List<Enfermero> listEnfermeros;
    private List<Paciente> listPacientes;
    private List<Departamento> listDepartamentos;

    public Hospital(String nombre, String direccion){

        this.nombre = nombre;
        this.direccion = direccion;
        this.listMedicos = new ArrayList<>();
        this.listAdministrativos = new ArrayList<>();
        this.listEnfermeros = new ArrayList<>();
        this.listPacientes = new ArrayList<>();
        this.listDepartamentos = new ArrayList<>();

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Medico> getListMedicos(){
        return listMedicos;
    }

    public void setListMedicos(List<Medico> listMedicos){
        this.listMedicos = listMedicos;
    }

    public List<Administrativo> getlistAdministrativos() {
        return listAdministrativos;
    }

    public void setListAdministrativos(List<Administrativo> listAdministrativos) {
        this.listAdministrativos = listAdministrativos;
    }

    public List<Enfermero> getlistEnfermeros() {
        return listEnfermeros;
    }

    public void setListEnfermeros(List<Enfermero> listEnfermeros) {
        this.listEnfermeros = listEnfermeros;
    }

    public List<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(List<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public List<Departamento> getlistDepartamentos() {
        return listDepartamentos;
    }

    public void setListDepartamentos(List<Departamento> listDepartamentos) {
        this.listDepartamentos = listDepartamentos;
    }

    public void registrarMedico(Medico medico){
        listMedicos.add(medico);
    }

    public void registrartAdministrativo(Administrativo administrativo){
        listAdministrativos.add(administrativo);
    }

    public void registrarEnfermero(Enfermero enfermero){
        listEnfermeros.add(enfermero);
    }

    public void registrarPaciente(Paciente paciente){
        listPacientes.add(paciente);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listMedicos=" + listMedicos +
                ", listAdministrativos=" + listAdministrativos +
                ", listEnfermeros=" + listEnfermeros +
                ", listPacientes=" + listPacientes +
                ", listDepartamentos=" + listDepartamentos +
                '}';
    }
}
