package principal;

import modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");

        Produto pizza = new Pizza(1,"Pizza de Calabresa",20.00, Tamanho.deLetra("m"));
        Produto vodka = new Bebida(1,"Vodka",21.00,2.00);
        Produto brigadeiro = new Sobremesa(1,"Brigadeiro",1.50,120);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(pizza);
        produtos.add(vodka);
        produtos.add(brigadeiro);

        for(Produto produto : produtos ){
            System.out.println(produto.getPreco());
        }

    }
}
