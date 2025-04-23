package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {

    private List<Medico> listMedicos;
    private HistoriaClinica historiaClinica;

    public Paciente (String nombre,int ID, String telefono){
        super(nombre,ID,telefono);
        this.listMedicos = new ArrayList<>();
        this.historiaClinica = historiaClinica;
    }

    public List<Medico> getListMedicos(){
        return listMedicos;
    }

    public void setListMedicos (List<Medico> listMedicos){
        this.listMedicos = listMedicos;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
