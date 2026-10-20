package modelo;

public class Sobremesa extends Produto{
    private int calorias;

    public Sobremesa(int codigo, String nome, double precoBase, int calorias) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome invalido");
        super(codigo, nome, precoBase);
        this.calorias = calorias;
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.SOBREMESA;
    }

    @Override
    public double getPreco() {
        return getPrecoBase();
    }

    @Override
    public String toString() {
        return "Sobremesa{" + getNome() +
                ", calorias=" + calorias +
                '}';
    }
}
