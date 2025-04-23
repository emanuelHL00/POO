package co.edu.uniquindio.poo.Model;

import java.util.List;

public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta(int placa, String marca, String modelo, int cilindraje){
        super(placa,marca,modelo);
    }

    public double calcularCosto(List<Paquete> listPaquetes, Zona zona, int peajes, double distancia) {
        int cantidadPaquetes = listPaquetes.size();
        if (zona == Zona.RURAL) {
            return cantidadPaquetes * 15000;
        } else {
            return cantidadPaquetes * 8000;
        }
    }


}
