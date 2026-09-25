package org.example;

public class Circulo extends FormaGeometrica {
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