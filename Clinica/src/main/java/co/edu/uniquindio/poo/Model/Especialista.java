package co.edu.uniquindio.poo.Model;

import java.util.List;

public class Especialista extends PersonalApoyo{
    private int aniosExperiencia;
    private AreaEspecialista areaEspecialista;

    public Especialista(String nombre, String cedula, String direccion, String telefono, int aniosExperiencia, AreaEspecialista areaEspecialista){
        super(nombre, cedula, direccion, telefono);
        this.aniosExperiencia = aniosExperiencia;
        this.areaEspecialista = areaEspecialista;

    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia = aniosExperiencia;
    }

    public AreaEspecialista getAreaEspecialista(){
        return areaEspecialista;
    }

    public void setAreaEspecialista(AreaEspecialista areaEspecialista){
        this.areaEspecialista = areaEspecialista;
    }

    public double calcularCosto(List<Tratamiento> listTratamientos){
        if(areaEspecialista == AreaEspecialista.CARDIOLOGIA){
            return 80000 * listTratamientos.size();
        } else if (areaEspecialista == AreaEspecialista.NEUROLOGIA) {
            return 160000 * listTratamientos.size();
        }
        return 0;
    }

}
