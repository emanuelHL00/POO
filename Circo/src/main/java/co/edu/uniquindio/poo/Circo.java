package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class Circo {

    private String nombre;
    private List<Cliente> listClientes;
    private List<Funcion> listFunciones;
    private List<Artista> listArtistas;
    private List<Acto> listActos;


    public Circo (String nombre){
        this.nombre = nombre;
        this.listClientes = new ArrayList<>();
        this.listFunciones = new ArrayList<>();
        this.listArtistas = new ArrayList<>();
        this.listActos = new ArrayList<>();

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Cliente> getlistClientes(){
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes){
        this.listClientes = listClientes;
    }

    public List<Funcion> getListFunciones(){
        return listFunciones;
    }

    public void setListFunciones (List<Funcion> listFunciones){
        this.listFunciones = listFunciones;
    }

    public List<Artista> getlistArtistas(){
        return listArtistas;
    }

    public void setListArtistas (List<Artista> listArtistas){
        this.listArtistas = listArtistas;
    }

    public List<Acto> getListactos(){
        return listActos;
    }

    public void setListActos (List<Acto> listActos){
        this.listActos = listActos;
    }


    public void registrarCliente(Cliente cliente){
        listClientes.add(cliente);
    }

    public void registrarFunciones(Funcion funcion){
        listFunciones.add(funcion);
    }

    public void registrarArtistas(Artista artista){
        listArtistas.add(artista);
    }

    public void registrarActo (Acto acto){
        listActos.add(acto);
    }




    public String toString(){
        return "Circo "+ '\n' +
                "Nombre = " + nombre + '\n' +
                "Lista de Clientes = "+ listClientes + '\n' +
                "Lista de Funciones = " + listFunciones + '\n' +
                "Lista de Artistas = " + listArtistas + '\n' +
                "Lista de Actos = " + listActos;
    }


}
