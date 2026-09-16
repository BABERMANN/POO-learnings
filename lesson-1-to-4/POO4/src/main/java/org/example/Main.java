package org.example;

public class Main {
    static void main() {
        System.out.println("ola");

        Estoque estoque1 = new Estoque(10);
        Item comida = new Item("Busca brisa", 9999);
        Item bebida = new Item("ice maracuja", 999232329);

        estoque1.adicionarItem(comida);
        estoque1.adicionarItem(bebida);

        System.out.println(estoque1.relatorio());




    }
}