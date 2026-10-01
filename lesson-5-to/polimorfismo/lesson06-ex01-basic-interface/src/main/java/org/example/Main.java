package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello");

        Boleto boletoDoEredin = new Boleto(650.67, 3);
        CartaoCredito cartaoDoEredon = new CartaoCredito(1500, 5);

        System.out.println(boletoDoEredin.getValorOriginal());
        System.out.println(boletoDoEredin.calcularValor());

        System.out.println();
        System.out.println("Contas a Pagar:");

        Pagavel[] contasAPagar = {boletoDoEredin, cartaoDoEredon};

        for (Pagavel conta : contasAPagar){
            System.out.println(conta.calcularValor());
        }

        System.out.println();
        System.out.println(boletoDoEredin.resumo());



    }
    }

