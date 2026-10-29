package org.example;

public class ContaPoupanca extends ContaBancaria{
    private String numero;
    private double saldo;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public double calcularTaxaManutencao(){
        return 00.00;
    }
}
