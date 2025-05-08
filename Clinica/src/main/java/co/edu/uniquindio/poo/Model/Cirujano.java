package co.edu.uniquindio.poo.Model;

import java.util.List;

public class Cirujano extends PersonalApoyo {

    private int numIntervenciones;

    public Cirujano(String nombre, String cedula, String direccion, String telefono, int numIntervenciones ){
        super(nombre,cedula,direccion,telefono);

        this.numIntervenciones = numIntervenciones;
    }

    public int getNumIntervenciones(){
        return numIntervenciones;
    }

    public void setNumIntervenciones(int numIntervenciones) {
        this.numIntervenciones = numIntervenciones;
    }

    public double calcularCosto(List<Tratamiento> listTratamientos){
        return 100000 + (numIntervenciones * 50000);
    }

}
