package org.example;

public class CartaoCredito implements Pagavel {
    private double valorOriginal;
    private int parcelas;

    public CartaoCredito(double valorOriginal, int parcelas) {
        this.valorOriginal = valorOriginal;
        this.parcelas = parcelas;
    }

    @Override
    public double calcularValor(){
        return valorOriginal * 1.05;
    }

}
