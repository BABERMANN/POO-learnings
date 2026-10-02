package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("oLA");

        Validador<String> stringNaoVazia = texto -> !texto.isEmpty();
        Validador<Integer> numeroPositivo = numero -> numero > 0;

        System.out.println(stringNaoVazia.valido("Sim"));
        System.out.println(numeroPositivo.valido(12));
        System.out.println(numeroPositivo.valido(-12));


    }
}