package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Medico> listMedicosDepartamento;

    public Departamento(String nombre){
        this.nombre = nombre;
        this.listMedicosDepartamento = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public List<Medico> getListMedicosDepartamento(){
        return listMedicosDepartamento;
    }

    public void  setListMedicosDepartamento(List<Medico> listMedicosDepartamento){
        this.listMedicosDepartamento = listMedicosDepartamento;

    }

    public void agregarMedico(Medico medico){
        listMedicosDepartamento.add(medico);
    }

}
