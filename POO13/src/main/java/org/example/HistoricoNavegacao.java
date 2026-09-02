package org.example;

public class HistoricoNavegacao {
    private String[] urls;
    private int qtdUrl;
    private int indiceAtual;

    public HistoricoNavegacao() {
        this.urls = new String[10];
        this.qtdUrl = 0;
        this.indiceAtual = 0;
    }

    public void visitar(String url) {
        urls[indiceAtual] = url;
        indiceAtual = (indiceAtual + 1) % urls.length;
        qtdUrl++;
    }

    public String listarRecentes() {
        if (qtdUrl == 0) return "Nenhuma URL visitada ainda";

        StringBuilder sb = new StringBuilder();
        int posicao = (indiceAtual - 1 + urls.length) % urls.length; // começa na mais recente

        for (int i = 0; i < qtdUrl; i++) {
            sb.append(urls[posicao]).append("\n");
            posicao = (posicao - 1 + urls.length) % urls.length; // anda pra trás, circulando
        }
        return sb.toString();
    }
    }

