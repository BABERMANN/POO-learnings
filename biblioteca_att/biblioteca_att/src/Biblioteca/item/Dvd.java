package Biblioteca.item;

import Biblioteca.multa.RegraMulta;

public class Dvd extends ItemAcervo {
    private int duracao;

    public Dvd(String titulo, RegraMulta regraMulta, int duracao) {
        super(titulo, regraMulta);
        this.duracao = duracao;
    }


    @Override
    public int getPrazoDias() {
        return 7;
    }
}
