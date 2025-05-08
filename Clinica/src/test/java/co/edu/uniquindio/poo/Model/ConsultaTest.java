package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class ConsultaTest {

    @Test
    public void testCostoCirujano(){
        Paciente paciente = new Paciente("Ana Pérez", "12345678", "ana@mail.com", "Calle Falsa", "dfghjk");
        Cirujano cirujano = new Cirujano("Dr. Juan", "1111", "Av. Siempre Viva", "3001234", 5);
        Consulta consulta = new Consulta(23, "dfgh", TipoConsulta.GENERAL, paciente, cirujano);
        // Agrego tratamientos
        // Calcular costo
        consulta.calcularCostoConsulta();
        // Esperado: 30_000 + 2 * 5_000 = 40_000
        assertEquals(350000, consulta.getCostoTotal());



    }

    @Test
    public void testCostoEspecialista(){

        Paciente paciente = new Paciente("Ana Pérez", "12345678", "ana@mail.com", "Calle Falsa", "dfghjk");
        Especialista especialista = new Especialista("Dr. Juan", "1111", "Av. Siempre Viva", "3001234", 12,AreaEspecialista.NEUROLOGIA);
        Consulta consulta = new Consulta(23, "dfgh", TipoConsulta.GENERAL, paciente, especialista);
        // Agrego tratamientos
        Tratamiento tratamiento2 = new Tratamiento("Chequeo de peso", "kjhgf");
        Tratamiento tratamiento1 = new Tratamiento("Toma de presión", "mjnhbgvf");
        consulta.agregarTratamiento(tratamiento1);
        consulta.agregarTratamiento(tratamiento2);
        // Calcular costo
        consulta.calcularCostoConsulta();
        // Esperado: 30_000 + 2 * 5_000 = 40_000
        assertEquals(320000, consulta.getCostoTotal());





    }

    @Test
    public void testCostoMedicoGeneral() {

        Paciente paciente = new Paciente("Ana Pérez", "12345678", "ana@mail.com", "Calle Falsa", "dfghjk");
        MedicoGeneral medico = new MedicoGeneral("Dr. Juan", "1111", "Av. Siempre Viva", "3001234", "Medicina Familiar");
        Consulta consulta = new Consulta(23, "dfgh", TipoConsulta.GENERAL, paciente, medico);
        // Agrego tratamientos
        Tratamiento tratamiento2 = new Tratamiento("Chequeo de peso", "kjhgf");
        Tratamiento tratamiento1 = new Tratamiento("Toma de presión", "mjnhbgvf");
        consulta.agregarTratamiento(tratamiento1);
        consulta.agregarTratamiento(tratamiento2);
        // Calcular costo
        consulta.calcularCostoConsulta();
        // Esperado: 30_000 + 2 * 5_000 = 40_000
        assertEquals(40000, consulta.getCostoTotal());


    }
}












