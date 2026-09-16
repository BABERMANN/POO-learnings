package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        Pessoa eredin = new Pessoa("Caua");
        Pessoa eredi = new Pessoa("Pi");
        Pessoa ered = new Pessoa("gio");
        Pessoa ere = new Pessoa("julia");
        Pessoa er = new Pessoa("gui");

        eredin.adicionarAmigos(er);
        eredin.adicionarAmigos(eredi);
        eredin.adicionarAmigos(ered);


        boolean eredinGui = eredin.saoAmigos(er);
        if (eredinGui){
            System.out.println("Sao amigos");
        }else System.out.println("Se odeiam");

        boolean eredinjulia = eredin.saoAmigos(ere);
        if (eredinjulia){
            System.out.println("Sao amigos");
        }else System.out.println("Se odeiam");

        System.out.println(eredin.quantidadeAmigos());
        System.out.println(er.quantidadeAmigos());


    }
}