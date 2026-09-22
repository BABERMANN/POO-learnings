package org.example;

public class Circulo extends FormaGeometrica {
    private  double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    private double area(){
        double PI = Math.PI;
        return PI * (raio * raio);
    }
}
