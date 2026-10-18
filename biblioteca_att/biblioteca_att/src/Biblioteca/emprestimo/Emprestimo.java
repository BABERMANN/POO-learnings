package Biblioteca.emprestimo;

import Biblioteca.user.Emprestavel;
import Biblioteca.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Emprestimo {
    private final Emprestavel item;
    private final Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao = LocalDate.now();
    private LocalDate dataPrevista;

    public Emprestimo(Usuario usuario, Emprestavel item, LocalDate dataEmprestimo) {
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataEmprestimo.plusDays(item.getPrazo());
    }

    public void devolver(LocalDate data) {
        this.dataDevolucao = data;
    }

    public void renovar(LocalDate data) {
        this.dataPrevista = data;
    }

    public int diasAtraso(LocalDate data) {
        return Math.toIntExact(ChronoUnit.DAYS.between(this.dataPrevista, data));
    }

    public boolean isAtrasado(LocalDate data) {
        return ChronoUnit.DAYS.between(this.dataPrevista, data) > 0;
    }

    public BigDecimal valorMulta() {
        if (item != null && this.isAtrasado(this.dataPrevista) ) {
            BigDecimal desconto = BigDecimal.valueOf(usuario.getDescontoMulta());
            return (item.calcularMulta(diasAtraso(dataDevolucao))).multiply(desconto);
        }

        return BigDecimal.ZERO;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(item, that.item) && Objects.equals(usuario, that.usuario) && Objects.equals(dataEmprestimo, that.dataEmprestimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, usuario, dataEmprestimo);
    }
}



