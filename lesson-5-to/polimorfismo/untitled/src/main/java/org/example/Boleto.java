package org.example;

public class Boleto implements Pagavel{
    private double valorOriginal;
    private int diasAtraso;

    public Boleto(double valorOriginal, int diasAtraso) {
        this.valorOriginal = valorOriginal;
        this.diasAtraso = diasAtraso;
    }

    @Override
    public double calcularValor(){
        return valorOriginal + (diasAtraso * 2);
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }
}
