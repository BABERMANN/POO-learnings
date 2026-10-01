package org.example;

public final class Circulo extends FormaGeometrica { // final impede que qualquer outra classe herde de Circulo
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}