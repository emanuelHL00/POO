package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital San Rafael", "Calle #14");

        Departamento departamento1 = new Departamento("Urgencias");
        Departamento departamento2 = new Departamento("Cirugias");
        Departamento departamento3 = new Departamento("Medicina Interna");


        Medico medico1 = new Medico("Manolo", 12345, "234567", Especialidades.PEDIATRIA, departamento1);

        departamento1.agregarMedico(medico1);

        Paciente paciente1 = new Paciente("Juan Martínez", 23456789, "23456");
        Paciente paciente2 = new Paciente("carlos", 3456, "685885");

        medico1.agregarPaciente(paciente1);
        medico1.agregarPaciente(paciente2);

        medico1.contadorPacientes();

        System.out.println(medico1.contadorPacientes());






    }
}