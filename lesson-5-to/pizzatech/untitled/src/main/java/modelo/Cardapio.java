package modelo;

import javax.print.DocFlavor;
import java.io.IOException;
import java.util.*;

public class Cardapio {
    private Map<Categoria, Map<Integer, Produto>> produtos;

    public Cardapio(Map<Categoria, Map<Integer, Produto>> produtos) {
        this.produtos = produtos;
    }

    public void adicionar(Produto produto) throws CardapioInvalidoException {
        if (produto == null) throw new CardapioInvalidoException("Produto invalido");

        if (produtos.get(produto.getCategoria()) == null) {
            Map<Integer, Produto> integerProdutoMap = new HashMap<>();
            integerProdutoMap.put(produto.getCodigo(), produto);
            produtos.put(produto.getCategoria(), integerProdutoMap);
        } else {
            Map<Integer, Produto> existMap = produtos.get(produto.getCategoria());
            if (existMap.containsKey(produto.getCodigo()))
                throw new CardapioInvalidoException("Esse produto contem codigo clone a outro produto");
            existMap.put(produto.getCodigo(), produto);
        }
    }

    public Optional<Produto> buscar(Categoria categoria, int codigo) {
        return Optional.ofNullable(produtos.get(categoria).get(codigo));
    }

    public List<Produto> listar(Categoria categoria) {
        List<Produto> list = new ArrayList<>();
        if (produtos.get(categoria) == null) {
            return List.of();
        }
        list.add((Produto) produtos.get(categoria).values());
        return list;
    }

    public void carregar(String linhas) throws CardapioInvalidoException, IOException {
        try {
            List<String> lista = Utilitario.carregarLinhas(linhas);
            for (String line : lista) {
                String[] campos = line.split(";");
                Categoria categoria = Categoria.valueOf(campos[0]);
                int codigo = Integer.parseInt(campos[1]);
                String nome = campos[2];
                double precoBase  = Double.parseDouble(campos[3]);
                String extra = campos[4];
            }
            }catch(IOException e){
                throw new CardapioInvalidoException("Nao foi possivel ler o arquivo");
            }
        }

}





