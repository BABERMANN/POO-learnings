package br.edu.ifsp;

import java.util.Arrays;
import java.util.Objects;

public class UrnaImpl implements Urna {
    private int[] nulos;
    private int[] brancos;
    private Partido[] partidos;

    public UrnaImpl(Partido[] partidos, int[] brancos, int[] nulos) {
        this.partidos = new Partido[100];
        this.brancos = new int[100];
        this.nulos = new int[100];
    }

    public int[] getNulos() {
        return nulos;
    }

    public int[] getBrancos() {
        return brancos;
    }

    private void setNulos(int[] nulos) {
        this.nulos = nulos;
    }

    private void setBrancos(int[] brancos) {
        this.brancos = brancos;
    }


    @Override
    public void carregar() {

    }

    @Override
    public void votar() {

    }

    @Override
    public void imprimir() {

    }

    private void imprimirPartidos(){}

    private void imprimirCandidatos(){}
}
