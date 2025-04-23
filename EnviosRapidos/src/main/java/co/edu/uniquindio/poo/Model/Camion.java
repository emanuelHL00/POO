package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(int placa, String marca, String modelo, double capacidadCarga ){
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public double calcularCosto(List<Paquete> listPaquetes, Zona zona, int peajes, double distancia) {
       double pesoTotal = 0;
       for(Paquete paquete: listPaquetes){
           pesoTotal += paquete.getPeso();
       }
        return peajes * 12000 + pesoTotal * 7000;
    }

}
