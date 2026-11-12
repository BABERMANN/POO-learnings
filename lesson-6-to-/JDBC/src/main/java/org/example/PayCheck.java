package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class PayCheck {
    private LocalDate payDay;
    private Double salary;

    public PayCheck(LocalDate payDay, Double salary) {
        this.payDay = payDay;
        this.salary = salary;
    }

    public LocalDate getPayDay() {
        return payDay;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "PayCheck{" +
                "payDay=" + payDay +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PayCheck payCheck = (PayCheck) o;
        return Objects.equals(payDay, payCheck.payDay) && Objects.equals(salary, payCheck.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payDay, salary);
    }
}
