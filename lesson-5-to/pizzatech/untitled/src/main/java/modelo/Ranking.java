package modelo;

import java.util.*;

public class Ranking<T extends Comparable<T>> {
    private List<T> itens;

    public void adicionar(T tipo) {
        itens.add(tipo);
    }

    public List<T> top(int n) {
        if (n <= 0) throw new IllegalArgumentException("Numero para ranking invalido");

        List<T> copia = new ArrayList<>(itens);
        copia.sort(Comparator.reverseOrder());

        return copia.stream()
                .limit(n)
                .toList();
    }

    public Optional<T> melhor(){
        return itens.stream().max(Comparator.naturalOrder());
    }

}
