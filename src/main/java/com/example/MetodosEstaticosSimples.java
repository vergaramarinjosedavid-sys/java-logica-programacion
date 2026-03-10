package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {

        saludar();
    }

    public static void saludar() {
        System.out.println("Hola desde un método estático");
    }

    public static void ejemploPasoParametros() {

        mostrarNombre("Carlos");
    }

    public static void mostrarNombre(String nombre) {
        System.out.println("Nombre: " + nombre);
    }

    public static void ejemploRetornoValores() {

        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void ejemploSobrecarga() {

        System.out.println(sumar(2, 3));
        System.out.println(sumar(2, 3, 4));
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}