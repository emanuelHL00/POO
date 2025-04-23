package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Vehiculo> listVehiculos;
    private List<Cliente> listClientes;
    private List<Envio> listEnvios;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.listVehiculos = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listEnvios = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(List<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public List<Envio> getListEnvios() {
        return listEnvios;
    }

    public void setListEnvios(List<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }

    public void agregarEnvio(Envio envio){
        listEnvios.add(envio);
    }


    public List<Envio> obtenerEnviosPesoMayor50(){
        List<Envio> listEnviosFiltrados = new ArrayList<>();
        for (Envio envio:listEnvios){
            double totalPeso = 0;
            for(Paquete paquete:envio.getListPaquetes()){
                totalPeso += paquete.getPeso();
            }

            if (totalPeso > 50){
                listEnviosFiltrados.add(envio);
            }

        }

        return listEnviosFiltrados;
    }


}
