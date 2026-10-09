package org.infra;

import org.example.FakeEmployeeRepository;
import org.example.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Main {
    static void main(String[] args) {
//        System.out.println("ola");

        Repository<String,Jogador> repository = new FakeJogadorRepository();

        RegisterJogador registerJogador = new RegisterJogador(repository);
        FindJogador findJogador = new FindJogador(repository);

        repository.save(new Jogador("01","Eredin","Sentinela",67,1313.13, LocalDate.of(2005,2,2)));
        repository.save(new Jogador("02","Felipe","Duelista",68,1313.12, LocalDate.of(2005,5,12)));
        repository.save(new Jogador("03","Rafael","Controlador",69,1313.11, LocalDate.of(2005,6,2)));
        repository.save(new Jogador("04","Eric","Iniciador,",70,1313.10, LocalDate.of(2005,11,4)));
        repository.save(new Jogador("05","Guilherme","Duelista,",66,1311.12, LocalDate.of(2005,9,12)));


        System.out.println("------------------------------------------------");
        Jogador[] leud = findJogador.findAll();
        for(Jogador leudAtletas : leud){
            leudAtletas.jiglePrint();
        }

        System.out.println("-------------------------------------------------");

        System.out.println(findJogador.findById("02"));

    }

}
