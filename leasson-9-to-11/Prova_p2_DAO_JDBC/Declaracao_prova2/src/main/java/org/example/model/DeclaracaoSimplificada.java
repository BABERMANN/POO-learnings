package org.example.model;

public class DeclaracaoSimplificada extends Declaracao{

    public DeclaracaoSimplificada(Integer id, double ganhoTributavel, double valorJapago) {
        super(id, ganhoTributavel, valorJapago);
    }

    @Override
    protected double valorImpost() {
        if(getGanhoTributavel() > 22847.88) return getGanhoTributavel() * 0.20;
        return 00.00;
    }
}
