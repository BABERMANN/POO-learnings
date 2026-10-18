package Biblioteca.item;

import Biblioteca.multa.RegraMulta;

public class Livro extends ItemAcervo {
    private String autor;

    public Livro(String titulo, RegraMulta regraMulta, String autor) {
        super(titulo, regraMulta);
        this.autor = autor;
    }


    @Override
    public int getPrazoDias() {
        return 14;
    }
}