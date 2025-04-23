package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

public class Funcion {
    private String fecha;
    private String hora;
    private String lugar;
    private List<Cliente> listClientes;
    private List<Acto> listActos;

    public Funcion(String fecha, String hora, String lugar){
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.listClientes = new ArrayList<>();
        this.listActos = new ArrayList<>();

    }

    public String getFecha (){
        return fecha;
    }

    public void setFecha (String fecha){
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Cliente> getlistClientes(){
        return listClientes;
    }

    public void setListClientes (List<Cliente> listClientes){
        this.listClientes = listClientes;
    }

    public List<Acto> getListActos(){
        return listActos;
    }

    public void setListActos (List<Acto> listActos){
        this.listActos = listActos;
    }

    public void agregarCliente(Cliente cliente){
        listClientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", listClientes=" + listClientes +
                ", listActos=" + listActos +
                '}';
    }
}
