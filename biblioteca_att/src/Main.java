import Biblioteca.emprestimo.Emprestimo;
import Biblioteca.item.Livro;
import Biblioteca.item.Revista;
import Biblioteca.multa.MultaDiaria;
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

//
        MultaDiaria multa1 = new MultaDiaria(BigDecimal.valueOf(0.30));
//        System.out.println(multa1.calcular(5));
//
//        System.out.println("-----------------------------------");
//
//
        Livro livro = new Livro("Contos do Eredin",multa1,"Eredin");
       Revista revista = new Revista("Mad",multa1,1);
//
//        System.out.println(livro.calcularMulta(livro.getPrazoDias()));
//        System.out.println(revista.calcularMulta(revista.getPrazoDias()));


        Usuario aluno1 = new Aluno("Eredin");
        Usuario prof1 = new Professor("Nadir");
//        System.out.println(prof1.getLimiteEmprestimos());
//        System.out.println(prof1.getDescontoMulta());
//        System.out.println(aluno1.getLimiteEmprestimos());
//        System.out.println(aluno1.getDescontoMulta());



        List<Emprestavel> emprestimos = new ArrayList<>();

        emprestimos.add(livro);
        emprestimos.add(revista);

        for(Emprestavel artigos: emprestimos){
            System.out.println(artigos.calcularMulta(7));
            System.out.println(artigos.getPrazo());
        }
        System.out.println("-----------------emprestimo-----------------------");
        Emprestimo emprestimo1 = new Emprestimo(aluno1,revista,
                LocalDate.of(2026,10,1),
                LocalDate.of(2026,10,10));

        emprestimo1.devolver(LocalDate.of(2026,10, 14));
        System.out.println(emprestimo1.diasAtraso(LocalDate.of(2026,10, 11)));

    }
}