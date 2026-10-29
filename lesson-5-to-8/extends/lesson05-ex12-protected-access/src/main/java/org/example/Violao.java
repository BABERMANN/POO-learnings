package org.example;

public class Violao extends Instrumento{

    public Violao() {
        super("Violao");
    }

    public String afinar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Afinado ").append(tipo);
        return sb.toString();
    }


}
