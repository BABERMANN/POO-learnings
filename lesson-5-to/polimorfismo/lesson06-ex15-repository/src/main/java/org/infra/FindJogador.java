package org.infra;
import org.example.Repository;

public class FindJogador {
    private final Repository<String,Jogador> repository;

    public FindJogador(Repository<String, Jogador> repository) {
        this.repository = repository;
    }

    public Jogador findById(String id) {
        return repository.findById(id);
    }

    public Jogador[] findAll() {
        return repository.findAll();
    }
}
