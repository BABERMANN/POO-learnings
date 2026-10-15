package streams;

import org.example.Pessoa;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    static void main(String[] args) {
        List<Pessoa2> pessoas = List.of(
                new Pessoa2("Eredin", org.example.Pessoa.Genero.MASCULINO),
                new Pessoa2("Marcos", org.example.Pessoa.Genero.MASCULINO),
                new Pessoa2("Larissa", org.example.Pessoa.Genero.FEMINIO),
                new Pessoa2("Juliana", org.example.Pessoa.Genero.FEMINIO),
                new Pessoa2("Gubert", Pessoa.Genero.BINARIO)
        );

        pessoas.stream()
                .map(pessoa -> pessoa.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        pessoas.stream()
                .map(pessoa2 -> pessoa2.genero)
                .collect(Collectors.toSet())
                .forEach(System.out::println);



    }

}

