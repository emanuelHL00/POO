package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre,cedula,correo,direccion,fechaNacimiento;
    private List<Consulta> listConsultas;

    public Paciente(String nombre, String cedula, String correo, String direccion, String fechaNacimiento){
        this.nombre=nombre;
        this.cedula=cedula;
        this.correo=correo;
        this.direccion=direccion;
        this.fechaNacimiento=fechaNacimiento;
        this.listConsultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }

    public List<Consulta> getListConsultas(){
        return listConsultas;
    }

    public void setListConsultas(List<Consulta> listConsultas){
        this.listConsultas=listConsultas;
    }

    public void agregarConsulta(Consulta consulta){
        listConsultas.add(consulta);
    }
}
