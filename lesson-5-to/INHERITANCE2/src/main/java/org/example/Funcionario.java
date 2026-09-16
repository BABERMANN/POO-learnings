package org.example;

public class Funcionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario(){
        return this.salarioBase;
    }

}
