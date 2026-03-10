package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {

        int[] numeros1;

        numeros1 = new int[3];

        int[] numeros2 = {1, 2, 3, 4, 5};

        System.out.println("Array creado e inicializado");
    }

    public static void mostrarLongitud() {

        int[] numeros = {1,2,3,4,5};

        System.out.println("Longitud: " + numeros.length);
    }

    public static void recorrerConForClasico() {

        int[] numeros = {10,20,30,40};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void recorrerConForEach() {

        int[] numeros = {10,20,30,40};

        for (int num : numeros) {
            System.out.println(num);
        }
    }

    public static void arrayComoParametroYRetorno() {

        int[] datos = {1,2,3};

        imprimirArray(datos);

        int[] nuevo = crearArray();

        imprimirArray(nuevo);
    }

    public static void imprimirArray(int[] array) {

        for (int num : array) {
            System.out.println(num);
        }
    }

    public static int[] crearArray() {

        return new int[]{7,8,9};
    }
}
