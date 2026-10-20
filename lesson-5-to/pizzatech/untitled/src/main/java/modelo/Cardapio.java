import modelo.Categoria;
import modelo.Produto;

import java.util.Map;

public class Cardapio {
    private Map<Categoria, Map<Integer, Produto>> produtos;

    public Cardapio(Map<Categoria, Map<Integer, Produto>> produtos) {
        this.produtos = produtos;
    }

    

}
