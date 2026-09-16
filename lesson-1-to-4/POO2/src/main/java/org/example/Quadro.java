package org.example;

public class Quadro {
    private String material;
    private String tamanho;

    public Quadro(String material, String tamanho) {
        this.material = material;
        this.tamanho = tamanho;
    }

    public int getPeso() {
        if (material.equals("Cobre")) return 100;
        if (material.equals("Ferro")) return 120;
        else return 0;
    }

    public String getMaterial() {
        return material;
    }

    public String getTamanho() {
        return tamanho;
    }
}

