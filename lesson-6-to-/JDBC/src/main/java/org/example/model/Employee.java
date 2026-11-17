package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    final private String id;
    final private String name;
    private String jobTitle;
    private double salary;
    final private LocalDate dateOfEmployment;
    private List<PayCheck> payChecks;

    public Employee(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
        payChecks = new ArrayList<>();
    }

    public double getYearsOfService() {
        return ChronoUnit.YEARS.between(dateOfEmployment, LocalDate.now());
    }

    public void addPayCheck(LocalDate payDay) {
        PayCheck payCheck = new PayCheck(payDay, salary);
        payChecks.add(payCheck);
    }

    public void removePayCheck(LocalDate payDay) {
        if(payDay == null) return;
        for (PayCheck p : payChecks) {
            if (p.getPayDay().equals(payDay)){
                payChecks.remove(p);
                return;
        }
        }
        throw new IllegalArgumentException("Não existe paycheck referente a essa data: " + dateOfEmployment + " para este funcionario");
    }

    public List<PayCheck> getPayChecks() {
        return payChecks;
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

        public double getSalary () {
            return salary;
        }

        public LocalDate getDateOfEmployment () {
            return dateOfEmployment;
        }

        public void setJobTitle (String jobTitle){
            this.jobTitle = jobTitle;
        }

        public void setSalary ( double salary){
            this.salary = salary;
        }

        @Override
        public boolean equals (Object o){
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(id, name);
        }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                ", payChecks=" + payChecks +
                '}' + '\n';
    }
}
