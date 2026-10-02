package org.example;

public class Boleto implements Somavel {
    private double valor;
    private int parcela;

    public Boleto(double valor, int parcela) {
        this.valor = valor;
        this.parcela = parcela;
    }

    @Override
    public double valor() {
        return valor;
    }
}
