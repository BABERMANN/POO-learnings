package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Atleta implements Comparable<Atleta>{
    private String nome;
    private List<Double> tempos;

    public Atleta(String nome, List<Double> tempos) {
        this.nome = nome;
        this.tempos = tempos;
    }

    @Override
    public int compareTo(Atleta o) {
        List<Double> temp1 = new ArrayList<>(tempos);
        temp1.sort(Comparator.naturalOrder());
        List<Double> temp2 = new ArrayList<>(o.tempos);
        temp2.sort(Comparator.naturalOrder());

        for (int i = 0; i < Math.min(temp1.size(),temp2.size()); i++) {
            int r  = Double.compare(temp1.get(i),temp2.get(i));
            if (r != 0) return r;
        }

        int p = Integer.compare(temp1.size(),temp2.size());
        if (p != 0) return p;

        return nome.compareToIgnoreCase(o.nome);

    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", tempos=" + tempos +
                '}';
    }

    public List<Double> getTempos() {
        return tempos;
    }
}
