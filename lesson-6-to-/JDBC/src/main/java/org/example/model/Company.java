package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Company {
    private  String name;
    private List<Employee> employeesList;

    public Company(String name) {
        employeesList = new ArrayList<>();
        this.name = name;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
