package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    private int placa;
    private String marca;
    private String modelo;

    public Vehiculo(int placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;

    }

    public int getPlaca(){
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }



    public abstract double calcularCosto(List<Paquete> paquetes, Zona zona, int peajes, double distancia);
}
