package Biblioteca;

import Biblioteca.calendario.Calendario;
import Biblioteca.emprestimo.Emprestimo;
import Biblioteca.item.ItemAcervo;
import Biblioteca.user.Emprestavel;
import Biblioteca.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemAcervo> acervo;
    private List<Emprestimo> emprestimos;
    private Calendario calendario;

    public Biblioteca(List<ItemAcervo> acervo, List<Emprestimo> emprestimos, Calendario calendario) {
        this.acervo = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.calendario = calendario;
    }

    public Emprestimo emprestar(Usuario user, Emprestavel emprestimo,LocalDate date){
       Emprestimo emprestimoC = new Emprestimo(user,emprestimo,date);
       emprestimos.add(emprestimoC);
       return emprestimoC;
    }

    public void devolver(Emprestimo emprestimo,LocalDate date){
        emprestimo.devolver(date);
    }

    public List<Emprestimo> listaAtrasados(LocalDate date){
        List<Emprestimo> atrasados = new ArrayList<>();
        for(Emprestimo emprestimo: emprestimos){
            if(emprestimo.isAtrasado(date)){
                atrasados.add(emprestimo);
            }
        }
        return atrasados;
    }

    public List<Emprestimo> vencendoEm(LocalDate date,int dias){
        List<Emprestimo> vencendo = new ArrayList<>();
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.diasAtraso(date) == dias){
                vencendo.add(emprestimo);
            }
        }
        return vencendo;
    }

    public BigDecimal totalMultasNoMes(YearMonth periodo){
        int multas = 0;
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.isAtrasado(periodo.atEndOfMonth())){
                multas++;
            }
        }
        return BigDecimal.valueOf(multas);
    }

}
