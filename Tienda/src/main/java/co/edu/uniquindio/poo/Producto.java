package co.edu.uniquindio.poo;

public class Producto {
    private String nombre, codigoProducto;
    private Double precio;
    private String categoria;
    private int stock;

    public Producto(String nombre, String codigoProducto, double precio, String categoria, int stock){
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto){
        this.codigoProducto = codigoProducto;
    }


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto " +
                "nombre = " + nombre + '\n' +
                ", codigoProducto = " + codigoProducto + '\n' +
                ", precio = " + precio +
                ", categoria = " + categoria + '\n' +
                ", stock=" + stock;


    }
}
