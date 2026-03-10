package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            System.out.println("Ejecutando bloque try");
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }
    }

    public static void evitarCierrePrograma() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {
            System.out.println("Entrada inválida. El programa continúa sin cerrarse.");
        }
    }
}