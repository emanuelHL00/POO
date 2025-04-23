package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class EnvioTest {



    @Test
    public void testCostoEnvioCamion() {
        Camion camion1 = new Camion(2345, "Renault", "moesle", 20);

        Cliente cliente1 = new Cliente("carlos", 2345, "sdfgvbn", "sdfgh");

        Envio envio = new Envio(2345, "23/03/23", cliente1, camion1, Zona.RURAL);

        Paquete paquete1 = new Paquete(234, 5, cliente1);
        Paquete paquete2 = new Paquete(4434, 10, cliente1);



        envio.agregarPaquete(paquete1);
        envio.agregarPaquete(paquete2);

        envio.calcularCostoTotal(2, 0);

        assertEquals(129000, envio.getTotalCosto());

    }




}