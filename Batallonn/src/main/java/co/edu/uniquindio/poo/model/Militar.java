package co.edu.uniquindio.poo.model;

public class Militar {
    private String nombre;
    private int edad;
    private String genero;

    public Militar(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Militar " + '\n' +
                "nombre = '" + nombre + '\n' +
                ", edad = " + edad + '\n' +
                ", genero = '" + genero;
    }
}
