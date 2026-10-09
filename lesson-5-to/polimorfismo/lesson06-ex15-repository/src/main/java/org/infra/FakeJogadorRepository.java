package org.infra;
import org.example.Repository;

import java.util.HashMap;
import java.util.Map;

public class FakeJogadorRepository implements Repository<String,Jogador> {
    private Map<String,Jogador> jogadores = new HashMap<>();

    @Override
    public void save(Jogador entity) {
        if (entity == null || jogadores.containsKey(entity.getId())){
            return;
        }
        jogadores.put(entity.getId(),entity);

    }

    @Override
    public Jogador findById(String id) {
        if(jogadores.containsKey(id)){
            return jogadores.get((id));
        }
        return null;
    }

    @Override
    public Jogador[] findAll() {
        int index = 0;
        Jogador[] jogador = new Jogador[jogadores.size()];
        for(Jogador jogadors : jogadores.values()){
            jogador[index] = jogadors;
            index++;
        }
        return jogador;
    }

    //    @Override
//    public Jogador[] findAll() {
//        return jogadores.values().toArray(new Jogador[0]);
//    }
}
