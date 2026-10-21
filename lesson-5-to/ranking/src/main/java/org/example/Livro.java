package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private LocalDate publicacao;

    public Livro(LocalDate publicacao, String titulo) {
        this.publicacao = publicacao;
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Livro o) {
        int r = publicacao.compareTo(o.publicacao);
        if (r != 0) return r;

        return titulo.compareToIgnoreCase(o.titulo);
    }
}
