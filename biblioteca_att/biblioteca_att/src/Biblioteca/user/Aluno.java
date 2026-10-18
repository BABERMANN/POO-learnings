package Biblioteca.user;

public class Aluno extends Usuario {
    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5;
    }

    @Override
    public double getDescontoMulta() {
        return 0.5;
    }
}
