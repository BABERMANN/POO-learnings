package Biblioteca.emprestimo;

import Biblioteca.user.Emprestavel;
import Biblioteca.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Emprestavel item;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao = LocalDate.now();

    public Emprestimo(Usuario usuario, Emprestavel item, LocalDate dataEmprestimo, LocalDate dataPrevista) {
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
    }

    public void devolver(LocalDate data){
        this.dataDevolucao = data;
    }

    public void renovar(LocalDate data){
        this.dataPrevista = data;
    }

    public int diasAtraso(LocalDate data){
        return   Math.toIntExact(ChronoUnit.DAYS.between(this.dataDevolucao,data));
    }
    public boolean isAtrasado(LocalDate data){
        return ChronoUnit.DAYS.between(this.dataDevolucao, data) > 0;
    }

    public BigDecimal valorMulta() {
        if (this.isAtrasado(LocalDate.now())) {
            BigDecimal multa = item.calcularMulta(this.diasAtraso(LocalDate.now()));
            multa = multa.multiply(BigDecimal.valueOf(usuario.getDescontoMulta()));  //TODO MELHORAR CODIGO
            return multa;
        }
        return BigDecimal.valueOf(0);

    }

}
