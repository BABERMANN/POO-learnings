package Biblioteca.user;

import java.math.BigDecimal;

public interface Emprestavel {
    public String getTitulo();
    public int getPrazo();
    public BigDecimal calcularMulta(int diasAtraso);
    public boolean isDisponivel();
    public void marcarEmprestimo();
    public void marcarDevolvido();
}
