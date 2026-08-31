package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");


        Contapalavra obj = new Contapalavra("Sim eu sou Sim! mas AS VEZES SOU NAO Sim SIM! nao sim sim","sIm");
        System.out.println(obj.contaOcorrencias());
    }
}