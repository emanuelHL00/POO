package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private int cedula;
    private String correo, direccion;
    private List<Envio> listEnvios;

    public Cliente(String nombre, int cedula, String correo, String direccion){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.listEnvios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public List<Envio> getListEnvios() {
        return listEnvios;
    }

    public void setListEnvios(List<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }
}
