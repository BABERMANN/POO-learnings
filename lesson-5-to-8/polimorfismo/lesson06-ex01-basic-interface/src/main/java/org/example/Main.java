package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Boleto boletoDoEredin = new Boleto(650.67, 3);
        CartaoCredito cartaoDoEredon = new CartaoCredito(1500, 5);
        Boleto boletoGeladeira = new Boleto(250,2);
        CartaoCredito cartaoDoEredoni = new CartaoCredito(1530, 5);

        Pagavel[] contas = {boletoDoEredin,boletoGeladeira,cartaoDoEredon,cartaoDoEredoni};

        for(Pagavel conta : contas){
            System.out.println("[" + conta.getClass().getSimpleName() + "]" + "valor: " + "[" + conta.calcularValor() + "]");
            if(conta instanceof CartaoCredito cartao){
                System.out.println(cartao.gerarFatura());
            }
        }

//        System.out.println(boletoDoEredin.getValorOriginal());
//        System.out.println(boletoDoEredin.calcularValor());
//
//        System.out.println();
//        System.out.println("Contas a Pagar:");
//
//        Pagavel[] contasAPagar = {boletoDoEredin, cartaoDoEredon};
//
//        for (Pagavel conta : contasAPagar){
//            System.out.println(conta.calcularValor());
//        }
//
//        System.out.println();
//        System.out.println(boletoDoEredin.resumo());
//
//        System.out.println();
//        System.out.println("Contas a pagar:");
//        System.out.println(Pagavel.categoriaPadrao());
    }
    }

