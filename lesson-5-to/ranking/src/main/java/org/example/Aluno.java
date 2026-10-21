package org.example;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private double media;
    private int faltas;

    public Aluno(String nome, double media, int faltas) {
        this.nome = nome;
        this.media = media;
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                ", faltas=" + faltas +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        int r = Double.compare(media,o.media);
        if (r != 0) return r;

        int f = Integer.compare(faltas,o.faltas);
        if(f != 0) return f;

        return nome.compareToIgnoreCase(o.nome);
    }
}
