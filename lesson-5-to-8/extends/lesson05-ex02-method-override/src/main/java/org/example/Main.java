package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello world");

        Gerente eredin = new Gerente("Eredin", 2000.00,800.00);

        System.out.println(eredin.calcularSalario());

    }

}