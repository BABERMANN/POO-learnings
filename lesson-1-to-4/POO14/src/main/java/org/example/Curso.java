package org.example;

public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int qtdAlunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new Aluno[30];
    }

    public void matricularAluno(Aluno a){
        if (qtdAlunos == alunos.length) return;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null){
                alunos[i] = a;
                a.adicionarCurso(this);
                qtdAlunos++;
                return;
            }
        }
    }
}