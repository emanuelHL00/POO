package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Venta {

    private String fecha;
    private double valorTotal, subTotal, impuesto;
    private Cliente cliente;
    private List<DetalleVenta> listDetalleVentas;

    public Venta (String fecha, double impuesto,Cliente cliente){
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.cliente = cliente;
        this.listDetalleVentas = new ArrayList<>();
        this.valorTotal = 0;
        this.subTotal = 0;
    }

    public String getFecha (){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public double getImpuesto(){
        return  impuesto;
    }

    public void setImpuesto(double impuesto){
        this.impuesto = impuesto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public  List<DetalleVenta> getListDetalleVentas() {
        return listDetalleVentas;
    }

    public void setListDetalleVentas(List<DetalleVenta> listDetalleVentas) {
        this.listDetalleVentas = listDetalleVentas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta" +
                "fecha = " + fecha + '\n' +
                "valorTotal = " + valorTotal + '\n' +
                "subTotal = " + subTotal + '\n' +
                "impuesto = " + impuesto + '\n' +
                "cliente = " + cliente + '\n' +
                "listDetalleVentas = " + listDetalleVentas;
    }
}
