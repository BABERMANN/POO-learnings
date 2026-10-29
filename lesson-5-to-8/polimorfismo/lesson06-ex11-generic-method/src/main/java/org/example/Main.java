package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");

        String[] nomes = {"Apolo", "eredin", "ukari"};

        System.out.println(Utilitarios.primeiro(nomes));
        System.out.println(Utilitarios.estaVazio(nomes));

        Integer[] numeros = {67,69,42};

        System.out.println();
        System.out.println(Utilitarios.primeiro(numeros));
        System.out.println(Utilitarios.estaVazio(numeros));


    }
}