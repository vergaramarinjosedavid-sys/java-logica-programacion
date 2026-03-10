package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000000L;

        System.out.println("=== Enteros ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("Rangos:");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
    }

    public static void demostrarFlotantes() {
        float f = 3.14f;
        double d = 3.14159265359;

        System.out.println("\n=== Flotantes ===");
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        char numero = '1';

        System.out.println("\n=== Caracteres ===");
        System.out.println("Letra: " + letra);
        System.out.println("Numero como char: " + numero);
    }

    public static void demostrarBooleanos() {
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("\n=== Booleanos ===");
        System.out.println("Verdadero: " + verdadero);
        System.out.println("Falso: " + falso);
    }

    public static void demostrarValoresPorDefecto() {
        System.out.println("\n=== Valores por defecto ===");
        System.out.println("byte: 0");
        System.out.println("short: 0");
        System.out.println("int: 0");
        System.out.println("long: 0L");
        System.out.println("float: 0.0f");
        System.out.println("double: 0.0");
        System.out.println("char: '\\u0000'");
        System.out.println("boolean: false");
    }
}