package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;



public class Tienda {

    private String nombre, nit;
    private List<Producto> listProductos;
    private List<Cliente> listClientes;
    private List<Venta> listVentas;



    public Tienda (String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listProductos = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit){
        this.nit = nit;
    }

    public List<Producto> getListProductos(){
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos){
        this.listProductos = listProductos;
    }

    public List<Cliente> getListClientes(){
        return listClientes;
    }

    public void setListclientes(List<Cliente> listClientes){
        this.listClientes = listClientes;
    }

    public List<Venta> getlistVentas (){
        return listVentas;
    }

    public void setListVentas (List<Venta> listVentas){
        this.listVentas = listVentas;
    }

    public String toString(){
        return "Tienda" +
                "nombre = " + nombre + '\n' +
                "nit = " + nit + '\n' +
                "Lista de clientes = " + listClientes + '\n' +
                "Lista de productos = " + listProductos + '\n' +
                "Lista de ventas = " + listVentas;
    }


}
