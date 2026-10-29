package modelo;

public class Pizza extends  Produto{
    private Tamanho tamanho;

    public Pizza(int codigo, String nome, double precoBase, Tamanho tamanho) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome invalido");
        super(codigo, nome, precoBase);
        this.tamanho = tamanho;
    }

    public double getPreco(){
        return getPrecoBase() * tamanho.getFator();
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.PIZZA;
    }

    @Override
    public String toString() {
        return getCategoria() + ", " + getCodigo() + ", " + getNome() + ", " + getPrecoBase() + ", " + tamanho;
    }
}
