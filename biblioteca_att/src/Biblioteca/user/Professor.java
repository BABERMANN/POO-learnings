package Biblioteca.user;

public class Professor extends Usuario {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 10;
    }

    @Override
    public double getDescontoMulta() {
        return 0.8;
    }
}
