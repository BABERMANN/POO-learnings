package org.example;

import java.time.LocalDate;

final class PerHourEmployee extends Employee {
    private double hourlyRate;
    private int workedHour;

    public PerHourEmployee(String id, String name, String jobTitle, LocalDate dateOfEmployment,double hourlyRate,int workedHour) {
        super(id, name, jobTitle, dateOfEmployment);
        this.workedHour = workedHour;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double salary() {
        return hourlyRate * workedHour;
    }


}
