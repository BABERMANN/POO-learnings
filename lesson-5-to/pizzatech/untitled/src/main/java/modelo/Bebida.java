package modelo;

public class Bebida extends Produto {
    private double Litros;

    public Bebida(int codigo, String nome, double precoBase, double litros) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome invalido");
        if(litros <= 0) throw new IllegalArgumentException("Litros invalidos");
        super(codigo, nome, precoBase);
        Litros = litros;
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.BEBIDA;
    }

    @Override
    public double getPreco() {
        return Litros * getPrecoBase();
    }

    @Override
    public String toString() {
        return "Bebida{" + getNome() +
                ", Litros=" + Litros +
                '}';
    }
}
