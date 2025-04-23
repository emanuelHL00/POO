package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MedicoTest {

    @Test
            public void contador(){
        Departamento Urgencias = new Departamento("urgencias");
        Medico medico1 = new Medico("Manolo", 12345, "234567", Especialidades.PEDIATRIA,Urgencias);

        Paciente paciente1 = new Paciente("carlo",12345, "234567");
        Paciente paciente2 = new Paciente("carlos",12345, "234567");

        medico1.agregarPaciente(paciente1);
        medico1.agregarPaciente(paciente2);

        assertEquals(2,medico1.contadorPacientes());

    }



}