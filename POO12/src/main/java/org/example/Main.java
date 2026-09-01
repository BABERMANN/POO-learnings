package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Criando o time ===");
        Team corinthians = new Team("Corinthians", "Itaquera-SP", "Diniz");

        Player p1 = new Player("Eredin", 10, "Centroavante", true);
        Player p2 = new Player("Pi", 7, "Meia", true);
        Player p3 = new Player("Gio", 4, "Zagueiro", true);
        Player p4 = new Player("Julia", 1, "Goleiro", true);
        Player p5 = new Player("Gui", 9, "Atacante", false); // reserva no banco

        corinthians.addPlayer(p1);
        corinthians.addPlayer(p2);
        corinthians.addPlayer(p3);
        corinthians.addPlayer(p4);
        corinthians.addPlayer(p5);

        System.out.println("\n=== Time completo ===");
        for (Player p : corinthians.getTime()) {
            if (p != null) System.out.println(p.getStateAsString());
        }

        System.out.println("\n=== Definindo capitão ===");
        corinthians.setCaptain(p1);
        System.out.println("Capitão definido (confira via getter se tiver um, ou debug)");

        System.out.println("\n=== Jogadores em campo ===");
        for (Player p : corinthians.fieldPlayer()) {
            if (p != null) System.out.println(p.getName());
        }

        System.out.println("\n=== Jogadores fora de campo ===");
        for (Player p : corinthians.getOutField()) {
            if (p != null) System.out.println(p.getName());
        }

        System.out.println("\n=== Fazendo substituição: Pi sai, Gui entra ===");
        corinthians.substitute(p2, p5);
        System.out.println("Pi está em campo? " + p2.isFielded()); // esperado: false
        System.out.println("Gui está em campo? " + p5.isFielded()); // esperado: true

        System.out.println("\n=== Removendo Gio do time ===");
        corinthians.removePlayer(p3);

        System.out.println("\n=== Time após remoção (deve ter null nas últimas posições) ===");
        Player[] timeAtual = corinthians.getTime();
        for (int i = 0; i < timeAtual.length; i++) {
            System.out.println("Índice " + i + ": " + (timeAtual[i] == null ? "vazio" : timeAtual[i].getName()));
        }
    }
}