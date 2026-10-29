package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("ola");

        Produto ketchup = new Produto("Ketchup", 7.50);

        System.out.println(ketchup); //Java ja chama o toString() automaticamente
    }
}