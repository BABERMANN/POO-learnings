package org.example;

public class Acumulador<T extends Somavel>{

    private Acumulador() {
    }

    public static <T extends Somavel> double somarTudo(T[] itens){
        double total = 0;
        for(T item : itens){
            total += item.valor();
        }
        return total;
    }

}
