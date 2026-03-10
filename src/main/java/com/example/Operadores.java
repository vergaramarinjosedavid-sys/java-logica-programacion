package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {

        int a = 10;
        int b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {

        int x = 5;

        System.out.println("\n=== Incremento / Decremento ===");

        System.out.println("Valor inicial: " + x);

        System.out.println("Prefijo ++x: " + (++x));
        System.out.println("Sufijo x++: " + (x++));

        System.out.println("Prefijo --x: " + (--x));
        System.out.println("Sufijo x--: " + (x--));
    }

    public static void demostrarRelacionales() {

        int a = 5;
        int b = 10;

        System.out.println("\n=== Operadores Relacionales ===");

        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    public static void demostrarLogicos() {

        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Operadores Lógicos ===");

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }

    public static void demostrarAsignacionCompuesta() {

        int num = 10;

        System.out.println("\n=== Asignación Compuesta ===");

        num += 5;
        System.out.println("num += 5 -> " + num);

        num -= 3;
        System.out.println("num -= 3 -> " + num);

        num *= 2;
        System.out.println("num *= 2 -> " + num);

        num /= 4;
        System.out.println("num /= 4 -> " + num);

        num %= 3;
        System.out.println("num %= 3 -> " + num);
    }

    public static void demostrarOperadorTernario() {

        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println("\n=== Operador Ternario ===");
        System.out.println(resultado);
    }
}