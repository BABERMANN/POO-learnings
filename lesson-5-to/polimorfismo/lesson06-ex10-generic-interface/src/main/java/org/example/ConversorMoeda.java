package org.example;

public class ConversorMoeda implements Conversor<Double>{
    private Double valor;


    @Override
    public String converter(Double item) {
        return "R$" + item;
    }
}
