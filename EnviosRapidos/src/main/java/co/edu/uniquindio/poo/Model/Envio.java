package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private int codigo;
    private double totalCosto;
    private String fechaEnvio;
    private List<Paquete> listPaquetes;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Zona zona;

    public Envio(int codigo, String fechaEnvio, Cliente cliente, Vehiculo vehiculo,Zona zona){

        this.codigo = codigo;
        this.fechaEnvio = fechaEnvio;
        this.listPaquetes = new ArrayList<>();
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.zona = zona;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public List<Paquete> getListPaquetes() {
        return listPaquetes;
    }

    public void setListPaquetes(List<Paquete> listPaquetes) {
        this.listPaquetes = listPaquetes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void agregarPaquete(Paquete paquete){
        listPaquetes.add(paquete);
    }

    public void calcularCostoTotal(int peajes, double distancia) {
        this.totalCosto = vehiculo.calcularCosto(listPaquetes, zona, peajes, distancia);
    }


}
