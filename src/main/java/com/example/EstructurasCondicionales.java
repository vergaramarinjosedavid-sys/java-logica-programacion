package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {

        int numero = 10;

        if (numero > 5) {
            System.out.println("El número es mayor que 5");
        }
    }

    public static void ejemploIfElse() {

        int edad = 17;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void ejemploIfElseIfElse() {

        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void ejemploSwitch() {

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }
    }

    public static void ejemploSwitchExpression() {

        int dia = 2;

        String nombre = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };

        System.out.println(nombre);
    }
}