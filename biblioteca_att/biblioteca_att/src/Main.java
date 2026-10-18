import Biblioteca.Biblioteca;
import Biblioteca.calendario.Calendario;
import Biblioteca.emprestimo.Emprestimo;
import Biblioteca.item.ItemAcervo;
import Biblioteca.item.Livro;
import Biblioteca.item.Revista;
import Biblioteca.multa.MultaDiaria;
import Biblioteca.multa.RegraMulta;
import Biblioteca.user.Aluno;
import Biblioteca.user.Emprestavel;
import Biblioteca.user.Professor;
import Biblioteca.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        System.out.println("Ola");

        RegraMulta multa1 = new MultaDiaria(BigDecimal.valueOf(2));

        List<Emprestimo> emprestimos = new ArrayList<>();
        List<ItemAcervo> acervoInimigos = new ArrayList<>();

        List<LocalDate> feriados = new ArrayList<>();
        Calendario calendario = new Calendario(feriados);

        ItemAcervo suicidas = new Livro("Suicidas",multa1,"Raphael Montes");
        ItemAcervo jantarSecreto = new Livro("Jnatar Secreto",multa1,"Raphael Montes");
        ItemAcervo RitaLeeBibliografia = new Livro("Rita Lee: Uma autoBibliografia",multa1,"Rita Lee");

        Usuario eredin = new Aluno("Eredin");
        Emprestimo emprestimo = new Emprestimo(eredin,suicidas,LocalDate.of(2026,3,21));

        System.out.println(emprestimo.isAtrasado(LocalDate.now()));
        System.out.println(emprestimo.diasAtraso(LocalDate.now()));
        System.out.println(emprestimo.valorMulta());


        Biblioteca biblioteca = new Biblioteca(acervoInimigos,emprestimos, calendario);

        //biblioteca.emprestar(eredin,emprestimo,)

    }
}