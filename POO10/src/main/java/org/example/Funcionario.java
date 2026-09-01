package org.example;

public class Funcionario {
    private String nome;
    private double salario;
    private Funcionario supervisor;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSupervisor(Funcionario f){
        this.supervisor = f;
    }

    public String getCadeiaDeComando(){
        if (supervisor == null){
            return nome;
        }
        return nome + " -> " + supervisor.getCadeiaDeComando();
    }
}
