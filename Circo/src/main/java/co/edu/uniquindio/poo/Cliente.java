package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre, apellido, numeroId, correo;

    public Cliente(String nombre, String apellido, String numeroId, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroId = numeroId;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNumeroId(){
        return numeroId;
    }

    public void setNumeroId(String numeroId){
        this.numeroId = numeroId;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String toString(){
        return "Cliente "+ '\n' +
                "Nombre = " + nombre + '\n' +
                "Apellido = "+ apellido + '\n' +
                "Numero de identificacion = " + numeroId + '\n' +
                "Correo = " + correo;
    }








}
