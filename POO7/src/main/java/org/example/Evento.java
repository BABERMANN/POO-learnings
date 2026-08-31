package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Evento{
    private String nome;
    private LocalDate data;

    public Evento(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public boolean jaOcorreu(){
        if(data.isBefore(LocalDate.now())){
            long diasPassou = ChronoUnit.DAYS.between(LocalDate.now(),data);
            System.out.println("Ja ocorreu ha:" + diasPassou + "Dias");
            return true;
        }
        long diasFalta = ChronoUnit.DAYS.between(LocalDate.now(),data);
        System.out.println("Ainda nao ocorreu, falta " + diasFalta + " Dias");
        return false;
    }

    public long diasAte(){
        long dias = ChronoUnit.DAYS.between(LocalDate.now(),data);
        if(dias > 0)  {
            System.out.println("Falta " + dias + " ate o evento");
            return dias;
        }
        System.out.println("esse evento ja aconteceu");
        return 0;
    }

}


