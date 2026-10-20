package modelo;

import java.util.Objects;

public abstract class Produto {
    private int codigo;
    private String nome;
    private double precoBase;
    private Categoria categoria;

    public Produto(int codigo, String nome, double precoBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract Categoria getCategoria();

    public abstract double getPreco();

    public double getPrecoBase() {
        return precoBase;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    //verificacao se o produto ja esta no map<Produto, integer>

}
