package co.edu.uniquindio.poo.model;

abstract class Persona {
    private String nombre;
    private int ID;
    private String telefono;

    public Persona(String nombre, int ID, String telefono){

        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String gettelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
