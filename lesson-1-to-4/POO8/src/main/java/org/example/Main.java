package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");

        // Cria a agenda: dia 19/09/2026, expediente das 9h às 18h
        Schedule schedule = new Schedule(
                LocalDate.of(2026, 9, 19),
                LocalTime.of(9, 0),
                LocalTime.of(18, 0)
        );

        // Cria algumas reuniões
        Meeting reuniao1 = new Meeting("Daily standup", LocalTime.of(9, 30), LocalTime.of(10, 0));
        Meeting reuniao2 = new Meeting("Reunião de planejamento", LocalTime.of(14, 0), LocalTime.of(15, 0));

        // Adiciona as reuniões válidas
        schedule.addMeeting(reuniao1);
        schedule.addMeeting(reuniao2);

        System.out.println(schedule.scheduleAsString());
        System.out.println("Porcentagem em reuniões: " + schedule.percentageSpent() + "%");

        // Testa uma reunião sobreposta — deve lançar exceção
        try {
            Meeting reuniaoConflito = new Meeting("Conflito", LocalTime.of(14, 30), LocalTime.of(15, 30));
            schedule.addMeeting(reuniaoConflito);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        // Remove uma reunião
        schedule.removeMeeting(reuniao1);
        System.out.println("Depois de remover:");
        System.out.println(schedule.scheduleAsString());
    }
}