package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int entero = scanner.nextInt();

        System.out.println("Ingrese un número decimal:");
        double decimal = scanner.nextDouble();

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.next();

        scanner.nextLine(); // limpiar buffer

        System.out.println("Ingrese una línea completa:");
        String linea = scanner.nextLine();

        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Linea: " + linea);
    }

    public static void manejarSaltoDeLineaPendiente() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // limpiar salto pendiente

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        System.out.println("Numero: " + numero);
        System.out.println("Texto: " + texto);
    }
}