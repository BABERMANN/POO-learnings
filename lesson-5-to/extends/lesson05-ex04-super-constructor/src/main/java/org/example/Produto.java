package org.example;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("Produto{");
        st.append("nome = ").append(nome);
        st.append(", preco = ").append(preco);
        st.append("}");

        return st.toString();


    }

}
