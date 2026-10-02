package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");

        Conversor<Double> conversorDoEredin = new ConversorMoeda();

        String resultado = conversorDoEredin.converter(5000.000);
        System.out.println(resultado);

    }
}