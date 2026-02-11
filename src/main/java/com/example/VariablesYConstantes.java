package com.example;

public class VariablesYConstantes {


    public static void demostrarDeclaracionAsignacion() {

        int edad = 17;
        double altura = 1.75;
        boolean esMayorDeEdad = false;
        char genero = 'M';
        String nombreCompleto = "jose vergara";

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
        System.out.println("Género: " + genero);
        System.out.println("Nombre completo: " + nombreCompleto);
    }

   
    public static void demostrarConvencionesNombres() {

        int numeroDeEstudiantes = 30;
        double precioPromedioProducto = 25.99;
        String nombreUsuarioActual = "usuario123";
        boolean tieneAccesoAdministrador = true;

        System.out.println("numeroDeEstudiantes: " + numeroDeEstudiantes);
        System.out.println("precioPromedioProducto: " + precioPromedioProducto);
        System.out.println("nombreUsuarioActual: " + nombreUsuarioActual);
        System.out.println("tieneAccesoAdministrador: " + tieneAccesoAdministrador);
    }

    
    public static void demostrarConstantes() {

        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;
        final String PAIS = "Colombia";

        System.out.println("PI: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
        System.out.println("País: " + PAIS);
    }

    public static void main(String[] args) {

        System.out.println("Declaración y Asignación");
        demostrarDeclaracionAsignacion();

        System.out.println("\n onvenciones de Nombres");
        demostrarConvencionesNombres();

        System.out.println("\n Constantes ");
        demostrarConstantes();
    }
}
