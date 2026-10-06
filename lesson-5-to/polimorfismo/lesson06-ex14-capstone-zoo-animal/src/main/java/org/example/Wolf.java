package org.example;

public class Wolf extends Animal{

    public Wolf(String nome) {
        super(nome);
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF");
    }

    public void run(){
        System.out.println("*Run");
    }
}
