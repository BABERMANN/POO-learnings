package org.example;

public class Turma {
    private String nome;
    private Aluno[] alunos;
    private int qtdAlunos = 0;

    public Turma(String nome) {
        if (nome == null) throw new IllegalArgumentException("Cada turma deve ter um nome");
        this.nome = nome;
        alunos = new Aluno[30];
    }

    public boolean matricularAluno(Aluno aluno) {
        if (qtdAlunos >= alunos.length) return false;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                qtdAlunos++;
                return true;
            }
        }
        return false;
    }

    public String listarAlunos() {
        if (alunos[0] == null) return "Sem alunos nessa classe";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qtdAlunos; i++) {
            if (alunos[i] != null) {
                sb.append(alunos[i].getNome());
                sb.append("- matricula -");
                sb.append(alunos[i].getMatricula());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}