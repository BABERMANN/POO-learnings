package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Eredin", Pessoa.Genero.MASCULINO),
                new Pessoa("Marcos", Pessoa.Genero.MASCULINO),
                new Pessoa("Larissa", Pessoa.Genero.FEMINIO),
                new Pessoa("Juliana", Pessoa.Genero.FEMINIO),
                new Pessoa("Gubert", Pessoa.Genero.MASCULINO)
        );




        // Imperativo: fazemos passo a passo da implementacao, acaba sendo um codigo grande
        List<Pessoa> Feminino = new ArrayList<>();
            for(Pessoa pessoa : pessoas ){
                if(Pessoa.Genero.FEMINIO.equals(pessoa.genero)){
                    Feminino.add(pessoa);
                }

            }
            for(Pessoa feminio : Feminino){
                System.out.println(feminio.toString());
            }


        // Modelo declarativo mais intuitivo, menor, declaro tudo que eu quero que seja feito

        List<Pessoa> feminino2 = pessoas.stream()
                .filter(pessoa -> Pessoa.Genero.FEMINIO.equals(pessoa.genero))
                .collect(Collectors.toList());
        feminino2.stream().forEach(System.out::println);

    }
    }
