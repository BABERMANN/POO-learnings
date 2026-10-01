package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello");

        Boleto boletoDoEredin = new Boleto(650.67,3);

        System.out.println(boletoDoEredin.getValorOriginal());
        System.out.println(boletoDoEredin.calcularValor());

    }
}