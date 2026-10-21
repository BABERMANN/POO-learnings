package org.example;

import java.time.LocalDate;
import java.util.*;



//
//Menor primeiro (crescente): o this vai na frente: compare(meu, dele).
//Maior primeiro (decrescente): o outro (o) vai na frente: compare(dele, meu).

public class Main {
    static void main(String[] args) {
        System.out.println("ola");

        Livro livro1 = new Livro(LocalDate.of(2015,3,10), "Java basico");
        Livro livro2 = new Livro(LocalDate.of(2010,7,1), "Banco de Dados");
        Livro livro3 = new Livro(LocalDate.of(2020,1,15), "Sim book");

        List<Livro> livros = new ArrayList<>();


        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        System.out.println(livros.toString());
        livros.sort(Comparator.reverseOrder());
        System.out.println(livros.toString());

        System.out.println("--------------------------alunos------------------------------");

        Aluno aluno1 = new Aluno("Eredin", 10.00,2);
        Aluno aluno2 = new Aluno("Catia",9.00,1);
        Aluno aluno3 = new Aluno("Roberta",10.00,12);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println(alunos.toString());
        alunos.sort(Comparator.reverseOrder());
        System.out.println(alunos.toString());


        System.out.println("--------------------------atletas------------------------------");

        Atleta atleta1;
        atleta1 = new Atleta("Eredin",List.of(21.00,13.00,31.00));

        System.out.println(atleta1.getTempos().stream()
                .sorted(Comparator.naturalOrder())
                .toList());
    }
}//