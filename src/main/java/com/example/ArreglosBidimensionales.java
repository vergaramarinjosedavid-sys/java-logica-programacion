package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz = new int[3][3];

        System.out.println("Matriz creada de 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Recorriendo matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] tabla = new int[3][3];

        System.out.println("Tabla de multiplicar básica:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                tabla[i - 1][j - 1] = i * j;
                System.out.print(tabla[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}