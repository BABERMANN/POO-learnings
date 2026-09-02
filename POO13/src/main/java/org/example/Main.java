package org.example;

public class Main {
    public  static void main(String[] args) {
        System.out.println("Hello world");

    HistoricoNavegacao historicoNavegacao = new HistoricoNavegacao();

    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim.com");
    historicoNavegacao.visitar("sim1.com");
    historicoNavegacao.visitar("nao.com");


    System.out.println(historicoNavegacao.listarRecentes());


    }
}