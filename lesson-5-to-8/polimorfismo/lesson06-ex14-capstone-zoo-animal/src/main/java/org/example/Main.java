package org.example;

public class Main {
    static void main(String[] args) {
//        System.out.println("oi");


        Lion leao = new Lion("Mufasa");
        Wolf lobo = new Wolf("Balto");
        Owl coruja = new Owl("Hedwin");

        Animal[] zoo =  {leao,lobo,coruja};

        for(Animal animais: zoo){
            System.out.println(animais.getNome());
            animais.makeSound();
            if(animais instanceof Lion lion){
                lion.run();
            }else if(animais instanceof Wolf wolf){
                wolf.run();
            }

            System.out.println("0--------------------------------------0");
        }


    }
}