package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Ola");


        Caixa<Integer> caixaDeIntenger = new Caixa<>();
        caixaDeIntenger.guardar(67);
        System.out.println(caixaDeIntenger.pegar());

        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Resenha 67");
        System.out.println(caixaDeString.pegar());

    }
}