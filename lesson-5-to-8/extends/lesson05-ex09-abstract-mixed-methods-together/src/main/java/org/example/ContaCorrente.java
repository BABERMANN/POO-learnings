package org.example;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public double calcularTaxaManutencao(){
        return 12.00;
    }

}
