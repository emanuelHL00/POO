package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circo circo = new Circo("Circo hermanos Gasca");


        Cliente cliente1 = new Cliente("Carlos", "Castillo", "123A", "ertyhjbvfc@gmail.com");
        circo.registrarCliente(cliente1);

        Funcion funcion = new Funcion("12/2025", "2:00 PM", "Armenia");
        funcion.agregarCliente(cliente1);
        circo.registrarFunciones(funcion);





        System.out.println(circo);

    }
}