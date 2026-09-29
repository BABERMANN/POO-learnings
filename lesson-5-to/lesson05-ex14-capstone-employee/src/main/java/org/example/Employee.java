package org.example;

import java.time.LocalDate;

public abstract sealed class Employee permits FullTimeEmployee, PerHourEmployee {
    private String id;
    private String name;
    private String jobTitle;
    private LocalDate dateOfEmployment;

    public Employee(String id, String name, String jobTitle, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(name);
        sb.append("\n");
        sb.append("Funcionario ID: ").append(id);
        sb.append("\n");
        sb.append("Cargo: ").append(jobTitle);
        sb.append("\n");
        sb.append("Data de contratacao: ").append(dateOfEmployment);

        return sb.toString();
    }

    public abstract double salary();
}
