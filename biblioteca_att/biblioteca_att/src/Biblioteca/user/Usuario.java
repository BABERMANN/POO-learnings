package Biblioteca.user;

public abstract class Usuario {
    private String nome;
    private int emprestimosAtivos;

    public Usuario(String nome) {
        this.nome = nome;
        this.emprestimosAtivos = 0;
    }

    public abstract int getLimiteEmprestimos();

    public abstract double getDescontoMulta();

    public boolean podeEmprestar(){
        return emprestimosAtivos < this.getLimiteEmprestimos();



    }

}
