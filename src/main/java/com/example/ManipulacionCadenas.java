package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String texto1 = "Hola";
        String texto2 = "Mundo";

        String resultado1 = texto1 + " " + texto2;
        String resultado2 = texto1.concat(" ").concat(texto2);

        System.out.println("Concatenación con + : " + resultado1);
        System.out.println("Concatenación con concat(): " + resultado2);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Programacion Java  ";

        System.out.println("length(): " + texto.length());
        System.out.println("charAt(2): " + texto.charAt(2));
        System.out.println("substring(2,6): " + texto.substring(2,6));
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("trim(): " + texto.trim());
        System.out.println("equals(): " + texto.equals("Java"));
        System.out.println("equalsIgnoreCase(): " + texto.equalsIgnoreCase("java"));
        System.out.println("contains(): " + texto.contains("Java"));
        System.out.println("startsWith(): " + texto.trim().startsWith("Programacion"));
        System.out.println("endsWith(): " + texto.trim().endsWith("Java"));
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";
        texto.concat(" Mundo");

        System.out.println("String original (inmutable): " + texto);

        texto = texto.concat(" Mundo");
        System.out.println("Nuevo String: " + texto);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hola ");
        sb.append("Mundo ");
        sb.append("desde ");
        sb.append("StringBuilder");

        System.out.println("Resultado: " + sb.toString());
    }
}