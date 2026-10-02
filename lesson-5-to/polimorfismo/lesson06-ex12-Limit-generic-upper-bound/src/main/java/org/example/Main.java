package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("OI");


        Boleto b1 = new Boleto(200.00,3);
        Boleto b2 = new Boleto(300.00,3);

        Boleto[] contas = {b1,b2};

        System.out.println(Acumulador.somarTudo(contas));


    }
}