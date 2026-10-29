package br.edu.ifsp;

import java.util.Objects;

public class Candidato {
    final private String nomeUrna;
    final private String nomeCompleto;
    final private int numero;
    private long votos = 0;
    final private Cargo cargo;

    public Candidato(String nomeUrna, Cargo cargo,int numero, String nomeCompleto) {
        this.nomeUrna = nomeUrna;
        this.cargo = cargo;
        this.numero = numero;
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUrna() {
        return nomeUrna;
    }

    public int getNumero() {
        return numero;
    }

    public long getVotos() {
        return votos;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void receberVoto(){
        votos++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return numero == candidato.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nomeUrna='" + nomeUrna + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", numero=" + numero +
                ", votos=" + votos +
                ", cargo=" + cargo +
                '}';
    }
}
