package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private Meeting[] meetings;
    private int qtdmeetings = 0;

    public Schedule(LocalDate day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        meetings = new Meeting[999];
    }

    private boolean sobrepoe(Meeting nova) {
        for (int i = 0; i < qtdmeetings; i++) {
            Meeting existente = meetings[i];
            if (nova.getStartTime().isBefore(existente.getEndTime()) && nova.getEndTime().isAfter(existente.getStartTime())) {
                return true;
            }
        }
        return false;
    }

    public void addMeeting(Meeting meeting){
        if(meeting.durationInMinutes() <= 0 || meeting.getStartTime().isBefore(startTime) || meeting.getEndTime().isAfter(endTime) ) throw new IllegalArgumentException("Horario invalido");
        if(sobrepoe(meeting)) throw new IllegalArgumentException("Um meeting esta soprepondo o outro");
        for (int i = 0; i < meetings.length; i++) {
            if(meetings[i] == null){
                meetings[i] = meeting;
                qtdmeetings++;
                return;
            }
        }
    }

    public void removeMeeting(Meeting m){
        LocalTime inicio = m.getStartTime();
        LocalTime fim = m.getEndTime();
        for (int i = 0; i < qtdmeetings; i++) {
            if (meetings[i].getStartTime().equals(inicio) && meetings[i].getEndTime().equals(fim)) {
                for (int j = i; j < qtdmeetings - 1; j++) {
                    meetings[j] = meetings[j + 1];
                }
                meetings[qtdmeetings - 1] = null;
                qtdmeetings--;
                return;
            }
        }
    }

    public double percentageSpent() {
        double minutos = 0;
        for (int i = 0; i < qtdmeetings; i++) {
            minutos += ChronoUnit.MINUTES.between(meetings[i].getStartTime(), meetings[i].getEndTime());
        }
        double totalExpediente = ChronoUnit.MINUTES.between(startTime, endTime);
        if (totalExpediente == 0) return 0;
        return (minutos * 100.0) / totalExpediente;
    }

    public String scheduleAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qtdmeetings; i++) {
            sb.append(meetings[i].getStartTime());
            sb.append("\n");
            sb.append(meetings[i].getEndTime());
            sb.append("\n");
            sb.append(meetings[i].getDescription());

        }
        return sb.toString();
    }

}



