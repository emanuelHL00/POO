package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicaTest {

    @Test
    public void obtenerCirujanomayor3(){

        Clinica clinica = new Clinica("clinicas");

        Cirujano cirujano = new Cirujano("Carlos", "345678","wsdfghj", "123456", 6);
        Cirujano cirujano1 = new Cirujano("Carlos", "345678","wsdfghj", "123456", 2);
        Cirujano cirujano2 = new Cirujano("Carlos", "345678","wsdfghj", "123456", 4);

        clinica.agregarCirujano(cirujano);
        clinica.agregarCirujano(cirujano1);
        clinica.agregarCirujano(cirujano2);

        List<Cirujano> listCirujanoFiltro = List.of(cirujano,cirujano2);

        assertIterableEquals(listCirujanoFiltro, clinica.obtenerCirujanosMayor3());




    }



}