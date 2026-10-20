package modelo;

public interface EstadoPedido {
    public void adicionarItem(Produto prod, int n);
    public void pagar();
    public void preparar();
    public void despachar();
    public void entregar();
    public void cancelar();
    public boolean isFinal();
}
