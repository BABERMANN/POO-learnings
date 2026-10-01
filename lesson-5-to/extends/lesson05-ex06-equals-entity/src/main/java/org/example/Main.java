package org.example;

public class Main{
    static void main(String[] args) {
        System.out.println("Hello");

        Coordenada c1 = new Coordenada(21.21,21.22);
        Coordenada c2 = new Coordenada(21.21,21.22);

        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // ainda sao objetos diferentes



    }

}