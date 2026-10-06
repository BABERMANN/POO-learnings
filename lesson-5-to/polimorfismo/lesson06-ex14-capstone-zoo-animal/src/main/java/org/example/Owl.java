package org.example;

public class Owl extends Animal{

    public Owl(String nome) {
        super(nome);
    }

    @Override
    public void makeSound() {
        System.out.println("PRuu-uuu");
    }

}
