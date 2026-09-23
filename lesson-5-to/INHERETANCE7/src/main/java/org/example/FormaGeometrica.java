package org.example;

public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double area();
}