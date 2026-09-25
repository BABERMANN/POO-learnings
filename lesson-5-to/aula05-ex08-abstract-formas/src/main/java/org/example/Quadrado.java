package org.example;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        if (lado <= 0) throw new IllegalArgumentException("Lado deve ser positivo");
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}