package org.example;

public abstract class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }
     public void depositar(double valor){
        this.saldo += valor;
     }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calcularTaxaManutencao();

}
