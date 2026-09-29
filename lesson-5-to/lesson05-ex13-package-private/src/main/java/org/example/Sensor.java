package org.example;

public class Sensor {
    protected int leituraAtual; //protected permite que classes filhas acessem diretamente o valor com esse prefixo

    public Sensor(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }
}
