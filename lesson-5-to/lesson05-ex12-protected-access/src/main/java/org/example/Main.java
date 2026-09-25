package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello world");

        Violao violaoDoEredin = new Violao();
        System.out.println(violaoDoEredin.getTipo());
        System.out.println(violaoDoEredin.afinar());


        //instrumento é uma classe generica ela representa qualquer ela representa qualquer instrumento musical
        // o  tipo precisa ser passado por paramentro pelos filhos ja que Instrumento nao sabe de antemao qual é o tipo

    }
}