package org.example;

public class Pessoa {
    final  String name;
    final Genero genero;

    public Pessoa(String name, Genero genero) {
        this.name = name;
        this.genero = genero;
    }

    enum Genero{
        MASCULINO,FEMINIO
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", genero=" + genero +
                '}';
    }
}
