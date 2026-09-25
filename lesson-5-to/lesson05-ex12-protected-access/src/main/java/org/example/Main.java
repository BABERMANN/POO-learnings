package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello world");

        Violao violaoDoEredin = new Violao("nylon");
        System.out.println(violaoDoEredin.getTipo());
        System.out.println(violaoDoEredin.afinar());

    }
}