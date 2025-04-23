package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre, identificacion, direccion, telefono, email;

    public Cliente (String nombre,String identificacion, String direccion, String telefono, String email){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Cliente" +
                "nombre = " + nombre + '\n' +
                "identificacion = " + identificacion + '\n' +
                "direccion = " + direccion + '\n' +
                "telefono = " + telefono + '\n' +
                "email = " + email;
    }
}
