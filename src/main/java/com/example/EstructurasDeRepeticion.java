package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {

        int i = 1;

        while (i <= 5) {
            System.out.println("While: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {

        int i = 1;

        do {
            System.out.println("DoWhile: " + i);
            i++;
        } while (i <= 5);
    }

    public static void ejemploForClasico() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("For: " + i);
        }
    }

    public static void ejemploForAnidado() {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

    public static void ejemploBreakContinue() {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            if (i == 8) {
                break;
            }

            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {

        externo:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break externo;
                }

                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}