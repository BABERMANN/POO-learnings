package org.example;

public class Bicicleta {
    private String modelo;
    private Quadro quadro;

    public Bicicleta(Quadro quadro, String modelo) {
        this.quadro = quadro;
        this.modelo = modelo;
    }

    public double getPesoEstimado(){
        return quadro.getPeso();
    }

    }

