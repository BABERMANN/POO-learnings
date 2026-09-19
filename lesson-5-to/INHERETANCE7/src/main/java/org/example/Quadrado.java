package org.example;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);

        if(lado < 4 || lado > 4) throw new IllegalArgumentException();
        this.lado = lado;
    }

    private double area(){

}
