package co.edu.uniquindio.poo.Model;

import java.util.List;

public class MedicoGeneral extends PersonalApoyo {
    private String especialidad;


    public MedicoGeneral(String nombre, String cedula, String direccion, String telefono, String especialidad) {
        super(nombre, cedula, direccion, telefono);
        this.especialidad = especialidad;

    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public double calcularCosto(List<Tratamiento> listTratamientos) {
        int contador = 0;
        for (Tratamiento tratamiento : listTratamientos) {
            contador += 1;
        }

        return 30000 + (contador * 5000);

    }



}
