package org.example;

public class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double area; // obriga toda subclasse implementar esse metodo
}
