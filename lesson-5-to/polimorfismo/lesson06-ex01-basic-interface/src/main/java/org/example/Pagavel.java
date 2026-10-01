package org.example;

public interface Pagavel {
    double calcularValor();

    default String resumo(){ // nao precisa implementar na classe
        return "Valor a pagar: " + calcularValor();
    }

}
