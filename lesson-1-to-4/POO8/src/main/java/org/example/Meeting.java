package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Meeting {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(String description, LocalTime startTime, LocalTime endTime) {
        if(ChronoUnit.MINUTES.between(startTime,endTime) <= 0) throw new IllegalArgumentException("Datas invalidas");
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public long durationInMinutes(){
        return ChronoUnit.MINUTES.between(startTime,endTime);
    }
}
