package org.example;

public class Pessoa {
    private String nome;
    private Pessoa[] amigos;
    private int qtdAmigos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.amigos = new Pessoa[20];
    }

    public void adicionarAmigos(Pessoa p){
        for (int i = 0; i <amigos.length; i++) {
            if(p.equals(amigos[i])) return;
            if(amigos[i] == null){
                amigos[i] = p;
                qtdAmigos++;
                return;
            }
        }
        return;
    }

    public boolean saoAmigos(Pessoa p){
        if(amigos[0] == null) return false;
        for (int i = 0; i < qtdAmigos; i++) {
            if (p.equals(amigos[i])) return true;
        }
        return false;
    }

    public int quantidadeAmigos(){
        return qtdAmigos;
    }

}
