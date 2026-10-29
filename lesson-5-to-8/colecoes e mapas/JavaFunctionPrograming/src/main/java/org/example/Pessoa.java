package org.example;

public class Pessoa {
    final  String name;
    final Genero genero;

    public Pessoa(String name, Genero genero) {
        this.name = name;
        this.genero = genero;
    }

    public enum Genero{
        MASCULINO, BINARIO, FEMINIO
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", genero=" + genero +
                '}';
    }
}
