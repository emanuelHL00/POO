package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Taller1 {


        public static class Estudiante{
        public String identificacion;
        public String nombres;
        public String apellidos;
        public String correo;
        public String telefono;
        public int edad;


        public Estudiante (String identificacion, String nombres, String apellidos,
                           String correo, String telefono, int edad){
            this.identificacion = identificacion;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.correo = correo;
            this.telefono = telefono;
            this.edad = edad;

        }


            public String toString() {
                return
                        "identificacion = " + identificacion + '\n' +
                        "nombres = " + nombres + '\n' +
                        "apellidos = " + apellidos + '\n' +
                        "correo = " + correo + '\n' +
                        "telefono = " + telefono + '\n' +
                        "edad = " + edad
                        ;

            }
    }

    public static class Main{
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Bienvenido al ingreso de estudiantes");

                System.out.println("Ingresa la identificacion del estudiante: ");
                String identificacion = scanner.nextLine();

                System.out.println("Ingresa los nombre del estudiante: ");
                String nombres = scanner.nextLine();

                System.out.println("Ingresa los apellidos del estudiante: ");
                String apellidos = scanner.nextLine();

                System.out.println("Ingresa el correo del estudiante: ");
                String correo = scanner.nextLine();

                System.out.println("Ingresa el telefono del estudiante: ");
                String telefono = scanner.nextLine();

                System.out.println("Ingresa la edad del estudiante: ");
                int edad = scanner.nextInt();

                Estudiante estudiante = new Estudiante(identificacion,nombres,apellidos,correo,telefono,edad);

                System.out.println("Estudiante registrado");
                System.out.println(estudiante);







            }

    }

}