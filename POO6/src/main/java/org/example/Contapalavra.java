package org.example;

import java.util.Arrays;
import java.util.Locale;

public class Contapalavra {
    private String frase;
    private String palavra;

    public Contapalavra(String frase, String palavra) {
        this.frase = frase;
        this.palavra = palavra;
    }

    public int contaOcorrencias(){
        String fraseFormat = frase.toLowerCase().replaceAll("[.,!?;:]", "");
        String[] palavras = fraseFormat.split(" ");
        String palavraFormat = palavra.toLowerCase();
        int contOcorrencia = 0;
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equals(palavraFormat)) contOcorrencia++;
        }
        return contOcorrencia;
    }
}



