package br.edu.ifsp;

import java.util.Objects;

public class Partido {
    final private int numero;
    final private String nome;

    public Partido(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return numero == partido.numero && Objects.equals(nome, partido.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nome);
    }

    @Override
    public String toString() {
        return "Partido{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void addCandidato(Candidato candidato){

    }

}
