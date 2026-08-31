package org.example;

public class Estoque {
    private Item[] itens;
    private int qtdItens = 0;

    public Estoque(int capacidade) {
        itens = new Item[capacidade];
    }

    public void adicionarItem(Item item) {
        if (qtdItens == itens.length) return;
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                qtdItens++;
                return;
            }
        }
        return;
    }

    public boolean removerItem(int idx){
         if(idx >= qtdItens || idx < 0) return false;//melhorar isso array fechar os espacos
        if(itens[idx] == null) return false;
        itens[idx] = null;
        qtdItens --;

        return true;
    }

    public String relatorio() {
        if (qtdItens <= 0) return "Esse estoque está vazio";
        StringBuilder sb = new StringBuilder();
        for (Item iten : itens) {
            if (iten != null) {
                sb.append(iten.getNome());
                sb.append(" - R$ ");
                sb.append(iten.getPreco());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}






