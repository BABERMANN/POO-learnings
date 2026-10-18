package Biblioteca.item;

import Biblioteca.multa.RegraMulta;

public class Revista extends ItemAcervo {
    private int edicao;

    public Revista(String titulo, RegraMulta regraMulta, int edicao) {
        super(titulo, regraMulta);
        this.edicao = edicao;
    }


    @Override
    public int getPrazoDias() {
        return 5;
    }
}
