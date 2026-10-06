package org.example;

public class Lion extends Animal{

    public Lion(String nome) {
        super(nome);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR");
    }


    public void run(){
        System.out.println("*run");
    }


}
