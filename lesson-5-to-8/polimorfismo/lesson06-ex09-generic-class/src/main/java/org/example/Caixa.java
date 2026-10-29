package org.example;

public class Caixa<T>{
    private T conteudo;

    public void guardar(T item){
        conteudo = item;
    }

    public T pegar(){
        return conteudo;
    }

}
