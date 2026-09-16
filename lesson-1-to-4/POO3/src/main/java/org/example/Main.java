package org.example;

public class Main {
    public static void main(String[] args) {
        Turma turma1 = new Turma("Nono ano");

        Aluno novoAluno = new Aluno("jorge", 313232);
        Aluno novoAluno2 = new Aluno("Eredin", 313233);

        boolean matriculou = turma1.matricularAluno(novoAluno2);
        boolean matriculou2 = turma1.matricularAluno(novoAluno);
        System.out.println("Matriculou? " + matriculou);

        System.out.println(turma1.listarAlunos());
    }
}