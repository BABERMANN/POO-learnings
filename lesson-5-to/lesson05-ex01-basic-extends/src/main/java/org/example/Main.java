package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Cachorro apolo = new Cachorro("Apolo", 13, "Vesgo");

        System.out.println(apolo.emitirSom());
        System.out.println(apolo.getIdade());
        System.out.println(apolo.getNome());
        System.out.println(apolo.getRaca());
    }
}