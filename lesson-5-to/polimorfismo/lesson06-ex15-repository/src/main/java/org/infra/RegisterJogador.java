package org.infra;
import org.example.Repository;


public class RegisterJogador {
    private final Repository<String,Jogador> repository;

    public RegisterJogador(Repository<String,Jogador> repository){
        this.repository = repository;
    }

    public boolean save(Jogador entity) {
        if(repository.findById(entity.getId()) == null){
            repository.save(entity);
            return true;
        }
        return false;
    }
}
