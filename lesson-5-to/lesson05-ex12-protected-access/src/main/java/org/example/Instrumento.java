package org.example;

public class Instrumento {
    protected String tipo; // protected mais permissivo deixa classes que herdam de instrumento acessar tipo sem ter que usar o getter

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
