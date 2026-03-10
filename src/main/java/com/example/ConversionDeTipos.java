package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito() {

        int entero = 100;
        double decimal = entero; // conversión automática

        System.out.println("=== Casting Implícito ===");
        System.out.println("Entero: " + entero);
        System.out.println("Convertido a double: " + decimal);
    }

    public static void demostrarCastingExplicito() {

        double decimal = 9.78;
        int entero = (int) decimal; // conversión manual

        System.out.println("\n=== Casting Explícito ===");
        System.out.println("Double: " + decimal);
        System.out.println("Convertido a int: " + entero);
    }

    public static void demostrarProblemasDePrecision() {

        double numeroGrande = 123456789.987654321;
        float numeroPequeno = (float) numeroGrande;

        System.out.println("\n=== Problema de Precisión ===");
        System.out.println("Double original: " + numeroGrande);
        System.out.println("Convertido a float: " + numeroPequeno);
    }
}