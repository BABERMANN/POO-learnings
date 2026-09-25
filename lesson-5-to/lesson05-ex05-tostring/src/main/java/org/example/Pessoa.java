package org.example;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if(o == null || getClass() != o.getClass()) return false;
       Pessoa pessoa = (Pessoa) o;                // casting tratanto o "o" como o tipo Pessoa
        return Objects.equals(cpf, pessoa.cpf);    // Objects.equals(a,b) faz um tratamento de Null verificando se existe algum antes de fazer o a.equals(b)

    }
}