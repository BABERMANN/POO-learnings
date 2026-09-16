package org.example;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello word");

        Evento evento = new Evento("resenha kris", LocalDate.of(2026,9,19));
        evento.jaOcorreu();
        evento.diasAte();
    }
}