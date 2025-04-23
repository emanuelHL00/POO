package co.edu.uniquindio.poo.Model;

import java.util.List;

public class Furgoneta extends Vehiculo {
    private Transmision transmision;


    public Furgoneta(int placa, String marca, String modelo, Transmision transmision){
        super(placa,marca,modelo);
        this.transmision = transmision;
    }

    public Transmision getTransmision(){
        return transmision;
    }

    public void setTransmision(Transmision transmision){
        this.transmision = transmision;
    }

    public double calcularCosto(List<Paquete> listPaquetes, Zona zona, int peajes, double distancia) {
        return distancia * 3000 + 10000;
    }



}
