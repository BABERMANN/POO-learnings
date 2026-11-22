package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    final private String id;
    final private String name;
    private String jobTitle;
    private Double salary;
    final private LocalDate dateOfEmployment;


    public Employee(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

        public double getYearsOfService() {
        return ChronoUnit.YEARS.between(dateOfEmployment, LocalDate.now());
    }

        public String getId () {
            return id;
        }

        public String getName () {
            return name;
        }

        public String getJobTitle () {
            return jobTitle;
        }

        public Double getSalary () {
            return salary;
        }

        public LocalDate getDateOfEmployment () {
            return dateOfEmployment;
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                '}';
    }
}
