package Biblioteca.item;

import Biblioteca.multa.RegraMulta;
import Biblioteca.user.Emprestavel;

import java.math.BigDecimal;

public abstract class ItemAcervo implements Emprestavel {
    private String titulo;
    private boolean disponivel = true;
    protected RegraMulta regraMulta;

    public ItemAcervo(String titulo, RegraMulta regraMulta) {
        this.titulo = titulo;
        this.regraMulta = regraMulta;
    }

    public abstract int getPrazoDias();

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int getPrazo() {
        return getPrazoDias();
    }

    @Override
    public BigDecimal calcularMulta(int diasAtraso) {
        return regraMulta.calcular(diasAtraso);
    }

    @Override
    public boolean isDisponivel() {
        return true;
    }

    @Override
    public void marcarEmprestimo() {

    }

    @Override
    public void marcarDevolvido() {

    }
}
