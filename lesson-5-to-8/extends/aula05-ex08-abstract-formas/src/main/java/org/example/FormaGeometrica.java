package org.example;

public sealed abstract class FormaGeometrica permits Quadrado, Circulo { // toda classe que herda de uma classe sealed deve ser final, sealde ou non sealed para que o prefixo seja respeitado e nao possa ser herdade por ninguem fora do permits.
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double area();
}