package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello world");



        ContaBancaria contaDoEredin = new ContaCorrente("676767");
        System.out.println(contaDoEredin.calcularTaxaManutencao());
        ContaBancaria contaDoApolo = new ContaPoupanca("767676");
        System.out.println(contaDoApolo.getSaldo());
        contaDoApolo.depositar(1200.52);
        System.out.println(contaDoApolo.getSaldo());
    }

}