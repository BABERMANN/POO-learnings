package org.example;

public class Utilitarios {

    private Utilitarios() {}

    public static <T> T primeiro(T[] lista){
        return lista[0];
    }

    public static <T> Boolean estaVazio(T[] lista){
        return lista[0] == null;
    }
}
