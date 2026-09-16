package org.example;

public class Aluno {
    private String aluno;
    private Curso[] cursos;

    public Aluno(String aluno) {
        this.aluno = aluno;
        this.cursos = new Curso[10];
    }

    public String getAluno() {
        return aluno;
    }

    public Curso[] getCursos() {
        return cursos.clone();
    }

    public void adicionarCurso(Curso c) {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i] == null) {
                cursos[i] = c;
                return;
            }
        }
    }
}