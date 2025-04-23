package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class EmpresaTest {

    @Test
    public void testObtenerEnviosPesoMayor50(){

        Empresa empresa = new Empresa("Envios rapidos");


        Cliente cliente = new Cliente("carlos", 23456, "waerftg", "wedfgh");

        Camion camion1 = new Camion(234, "dfg", "sdfg", 80);

        Envio envio1 = new Envio(2345, "23456",cliente, camion1, Zona.URBANA);
        Envio envio2 = new Envio(2845, "23456",cliente, camion1, Zona.RURAL);
        Envio envio3 = new Envio(2745, "23456",cliente, camion1, Zona.URBANA);

        Paquete paquete1 = new Paquete(17, 20, cliente);
        Paquete paquete2 = new Paquete(10, 10, cliente);
        Paquete paquete3 = new Paquete(11, 22, cliente);
        Paquete paquete4 = new Paquete(9, 12, cliente);
        Paquete paquete5 = new Paquete(8, 10, cliente);
        Paquete paquete6 = new Paquete(7, 4, cliente);
        Paquete paquete7 = new Paquete(1, 40, cliente);

        envio1.agregarPaquete(paquete1);
        envio1.agregarPaquete(paquete2);
        envio1.agregarPaquete(paquete3);
        envio2.agregarPaquete(paquete4);
        envio2.agregarPaquete(paquete5);
        envio2.agregarPaquete(paquete6);
        envio3.agregarPaquete(paquete7);
        envio3.agregarPaquete(paquete4);

        empresa.agregarEnvio(envio1);
        empresa.agregarEnvio(envio2);
        empresa.agregarEnvio(envio3);

        List<Envio> listEnviosFiltrados = List.of(envio1, envio3);

        assertIterableEquals(listEnviosFiltrados, empresa.obtenerEnviosPesoMayor50());













    }


}