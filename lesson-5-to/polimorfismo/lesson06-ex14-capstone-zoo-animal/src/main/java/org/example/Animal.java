package org.example;

abstract  class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract  void makeSound();

    public String getNome(){
        return this.nome;
    }
}
