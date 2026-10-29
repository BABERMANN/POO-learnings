package org.example;

import java.time.LocalDate;

final class FullTimeEmployee extends Employee {
    private double monthltSalary;

    public FullTimeEmployee(String id, String name, String jobTitle, LocalDate dateOfEmployment,double monthltSalary) {
        super(id, name, jobTitle, dateOfEmployment);
        this.monthltSalary = monthltSalary;
    }

    @Override
    public double salary() {
        return monthltSalary;
    }


}
