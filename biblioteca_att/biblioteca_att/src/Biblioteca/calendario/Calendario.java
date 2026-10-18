package Biblioteca.calendario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Calendario {
    private List<LocalDate> feriados;

    public Calendario(List<LocalDate> feriados) {
        this.feriados = feriados;
    }

    public boolean isDiaFeriado(LocalDate date) {
        return feriados.contains(date);
    }

    public LocalDate proximoDiaUtil(LocalDate date) {
        for (LocalDate feriado : feriados) {
            if (ChronoUnit.DAYS.between(LocalDate.now(), feriado) == 0 && feriados.contains(feriado.plusDays(1))) {
                return feriado.plusDays(1);
            }
        }
        return LocalDate.of(2026, 12, 25);
    }

    public void adicionarFeriado(LocalDate date){
        feriados.add(date);
    }




}