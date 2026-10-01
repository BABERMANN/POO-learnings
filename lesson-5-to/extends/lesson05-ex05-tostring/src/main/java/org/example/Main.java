package org.example;

public  class Main {
    static void main(String[] args) {
        System.out.println("ola");

        Pessoa p1 = new Pessoa("Eredin", "123.456.789-00");
        Pessoa p2 = new Pessoa("Eredin.H", "123.456.789-00");

        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(p1.equals(null));
        System.out.println(p1.equals("string qualquer"));
    }
}
