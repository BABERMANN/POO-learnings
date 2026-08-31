package org.example;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        if (nome == null) throw new IllegalArgumentException("Nome invalido");
        if (preco <= 0) throw new IllegalArgumentException("Preco invalido");

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
