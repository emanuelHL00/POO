package co.edu.uniquindio.poo.Model;

public class Paquete {
    private double codigo;
    private double peso;
    private Cliente cliente;


    public Paquete(int codigo, double peso, Cliente cliente){
        this.codigo = codigo;
        this.peso = peso;
        this.cliente = cliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
