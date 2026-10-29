package org.example;

public interface Pagavel {
    double calcularValor();

    default String resumo(){ // nao precisa implementar na classe
        return "Valor a pagar: " + calcularValor();
    }

    static String categoriaPadrao(){  // metodo estatico reponde pela pela classe em geral
        return "Conta a pagar generica";
    }

}
