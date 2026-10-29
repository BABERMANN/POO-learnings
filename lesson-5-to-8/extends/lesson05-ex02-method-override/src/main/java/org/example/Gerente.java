package org.example;

public class Gerente extends Funcionario {
    private Double bonusGerencia;

    public Gerente(String nome, Double salarioBase, Double bonusGerencia) {
        super(nome, salarioBase);
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public Double calcularSalario(){
         return super.calcularSalario() + bonusGerencia;
    }


}
